import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int currDir = 0;
        int cx = n / 2;
        int cy = n / 2;
        int sum = board[cx][cy];
        for (int i = 0; i < t; i++) {
            char command = commands.charAt(i);

            if (command == 'L') {
                currDir = (currDir + 4 - 1) % 4;
                continue;
            }
            else if (command == 'R') {
                currDir = (currDir + 1) % 4;
                continue;
            }

            int nx = cx + dx[currDir];
            int ny = cy + dy[currDir];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;

            sum += board[nx][ny];
            cx = nx;
            cy = ny;
        }

        System.out.println(sum);
    }
}
