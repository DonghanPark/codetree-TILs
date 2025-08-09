import java.util.Scanner;
public class Main {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        Point[] points = new Point[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                points[grid[i][j]] = new Point(i, j);
            }
        }

        // clockwise
        int[] dx = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = new int[]{0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n * n + 1; j++) { // 1-based index
                int x = points[j].x;
                int y = points[j].y;
                
                // find
                int maxNum = 0;
                for (int k = 0; k < 8; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];

                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                    
                    if (grid[nx][ny] > maxNum) {
                        maxNum = grid[nx][ny];
                    }
                }

                // swap
                int tempNum = grid[x][y];
                grid[x][y] = maxNum;
                grid[points[maxNum].x][points[maxNum].y] = tempNum;

                Point tempPoint = points[j];
                points[j] = points[maxNum];
                points[maxNum] = tempPoint;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}