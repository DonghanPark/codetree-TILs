import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // n = n - n%2;

        if (n == 1)
            System.out.print("*");

        for (int i = 0; i < n - n%2; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i || i > 0 && j%2 == 0)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}