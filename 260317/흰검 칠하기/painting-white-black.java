import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] grid = new int[(N*100*2 + 2)][2];
        int curr = N*100 + 1;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            int dir = 0;
            if (d == 'R') dir = 1;
            else dir = -1;

            for (int j = 0; j < x; j++) {
                if (d == 'R') {
                    grid[curr][0] += 1;
                    grid[curr][1] = 1;
                }
                else {
                    grid[curr][0] += 10;
                    grid[curr][1] = 10;
                }
                curr += dir;
            }
            curr -= dir;
        }
        
        int white = 0;
        int black = 0;
        int grey = 0;
        for (int i = 0; i < N*100*2 + 2; i++) {
            if (grid[i][0] > 99 || (grid[i][0] % 10 >= 2 && (grid[i][0] / 10) % 10 >= 2)) grey++;
            else if (grid[i][0] > 0 && grid[i][1] == 1) black++;
            else if (grid[i][0] > 0 && grid[i][1] == 10) white++;
        }

        System.out.println(white + " " + black + " " + grey);
    }
}