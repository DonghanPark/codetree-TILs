import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalPeople = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalPeople += arr[i];
        }
        // Please write your code here.

        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int remain = totalPeople;
            for (int j = 0; j < n; j++) {
                int limit = arr[(i + j) % n];

                if (remain < limit)
                    sum += remain * j;
                else
                    sum += arr[(i + j) % n] * j;
            }

            minSum = Math.min(minSum, sum);
        }

        System.out.println(minSum);
    }
}