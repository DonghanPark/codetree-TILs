import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            for (int j = b; j >= a; j=j-2) {
                System.out.printf("%d * %d = %d", j, i, j*i);
                if (j != a)
                    System.out.print(" / ");
            }
            System.out.println();
        }
    }
}