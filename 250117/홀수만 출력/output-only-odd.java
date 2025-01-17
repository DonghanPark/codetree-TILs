import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        for (i = a; i <= b; i++) {
            if (i % 2 != 0)
                System.out.printf("%d ", i);
        }
    }
}