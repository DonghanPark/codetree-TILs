import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int[][] marbles = new int[m][2];
        for (int i = 0; i < m; i++) {
            marbles[i][0] = sc.nextInt();
            marbles[i][1] = sc.nextInt();
        }
        
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        int countBall = m;

        for (int i = 0; i < t; i++) {
            int[][] temp = new int[n][n];
            for (int j = 0; j < m; j++) {
                int x = marbles[j][0] - 1;
                int y = marbles[j][1] - 1;

                int maxAdjacencyNum = -1;
                int maxX = x;
                int maxY = y;
                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];

                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;

                    if (grid[nx][ny] > maxAdjacencyNum) {
                        maxAdjacencyNum = grid[nx][ny];
                        maxX = nx;
                        maxY = ny;
                    }
                }

                marbles[j][0] = maxX + 1;
                marbles[j][1] = maxY + 1;

                temp[maxX][maxY] += 1;
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (temp[j][k] > 1) {
                        for (int l = 0; l < m; l++) {
                            if (marbles[l][0] == j + 1 && marbles[l][1] == k + 1) {
                                marbles[l][0] = n+1;
                                marbles[l][1] = n+1;
                                countBall--;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(countBall);
    }
}