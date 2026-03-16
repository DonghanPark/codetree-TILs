import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt() + 1000;
        int rect1_y1 = sc.nextInt() + 1000;
        int rect1_x2 = sc.nextInt() + 1000;
        int rect1_y2 = sc.nextInt() + 1000;
        int rect2_x1 = sc.nextInt() + 1000;
        int rect2_y1 = sc.nextInt() + 1000;
        int rect2_x2 = sc.nextInt() + 1000;
        int rect2_y2 = sc.nextInt() + 1000;
        
        int[][] grid = new int[2001][2001];
        
        for (int i = rect1_x1; i < rect1_x2; i++) {
            for (int j = rect1_y1; j < rect1_y2; j++) {
                grid[i][j] = 1;
            }
        }

        for (int i = rect2_x1; i < rect2_x2; i++) {
            for (int j = rect2_y1; j < rect2_y2; j++) {
                grid[i][j] = 2;
            }
        }

        int minX = 2002;
        int minY = 2002;
        int maxX = 0;
        int maxY = 0;
        int count = 0;
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (grid[i][j] != 1) continue;

                count++;

                minX = Math.min(minX, i);
                minY = Math.min(minY, j);
                maxX = Math.max(maxX, i);
                maxY = Math.max(maxY, j);
            }
        }

        if (count == 0)
            System.out.println(0);
        else
            System.out.println((maxX - minX + 1) * (maxY - minY + 1));
    }
}