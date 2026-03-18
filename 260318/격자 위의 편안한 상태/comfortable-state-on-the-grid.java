import java.util.Scanner;
public class Main {
    public static boolean inRange(int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            grid[r][c] = 1;

            int count = 0;
            for (int j = 0; j < 4; j++) {
                int nr = r + dx[j];
                int nc = c + dy[j];

                if (!inRange(nr, nc, n)) continue;

                if (grid[nr][nc] == 1)count++;
            }

            if (count == 3) System.out.println(1);
            else System.out.println(0);
        }
    }
}