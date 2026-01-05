import java.util.Scanner;

public class Main {
    public static int calcDist(int x1, int x2, int y1, int y2) {
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.

        int minSum = Integer.MAX_VALUE;
        for (int i = 1; i < n-1; i++) {
            int sum = 0;
            for (int j = 1; j < n; j++) {
                if (j == i) continue;
                if (j - 1 == i)
                    sum += calcDist(x[j-2], x[j], y[j-2], y[j]);
                else
                    sum += calcDist(x[j-1], x[j], y[j-1], y[j]);
            }

            minSum = Math.min(minSum, sum);
        }

        System.out.println(minSum);
    }
}