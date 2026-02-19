import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 3 + 1; j++) {
                for (int k = i + 1; k < n; k++) {
                    for (int l = 0; l < n - 3 + 1; l++) {
                        for (int m = 0; m < 3; m++) {
                            sum = sum + arr[i][j+m] + arr[k][l+m];
                        }

                        maxSum = Math.max(maxSum, sum);
                        sum = 0;
                    }
                }
            }
        }

        if (n >= 6) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 6 + 1; j++) {
                    for (int k = 0; k < 3; k++) {
                        sum = sum + arr[i][j + k] + arr[i][j + 3 + k];
                    }

                    maxSum = Math.max(maxSum, sum);
                    sum = 0;
                }
            }
        }

        System.out.println(maxSum);
    }
}