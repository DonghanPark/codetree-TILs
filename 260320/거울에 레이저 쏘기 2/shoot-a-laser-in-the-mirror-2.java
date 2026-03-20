import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();
        int num = (startNum - 1) / n;
        // System.out.println(num);
        int x = 0;
        int y = 0;
        if (num == 0) {
            x = 0;
            y = (startNum - 1) % n;
        }
        else if (num == 1) {
            x = (startNum - 1) % n;
            y = n - 1;
        }
        else if (num == 2) {
            x = n - 1;
            y = n - 1 - ((startNum - 1) % n);
        }
        else {
            x = n - 1 - ((startNum - 1) % n);
            y = 0;
        }

        // 하, 좌, 상, 우
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int currDir = num;

        int count = 0;
        while (x >= 0 && x < n && y >= 0 && y < n) {
            // System.out.println(x + " " + y + " " + currDir);
            if (grid[x][y] == '/')
                currDir = currDir ^ 1;
            else
                currDir = 3 - currDir;

            int nx = x + dx[currDir];
            int ny = y + dy[currDir];

            count++;

            x = nx;
            y = ny;

            // System.out.println(x + " " + y + " " + currDir + "\n");
        }

        System.out.println(count);
    }
}
