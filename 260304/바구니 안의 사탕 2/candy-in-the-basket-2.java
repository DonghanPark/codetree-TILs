import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // int[] candies = new int[n];
        int[] positions = new int[101];
        for (int i = 0; i < n; i++) {
            // candies[i] = sc.nextInt();
            // positions[i] = sc.nextInt();
            int candies = sc.nextInt();
            int position = sc.nextInt();
            positions[position] += candies;
        }
        
        int sum = 0;
        int maxSum = 0;
        int end = 2 * k + 1;
        for (int i = 0; i < end; i++) {
            sum += positions[i];
        }

        maxSum = Math.max(maxSum, sum);

        for (int i = end; i < 101; i++) {
            sum += positions[i];
            sum -= positions[i - end];

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}