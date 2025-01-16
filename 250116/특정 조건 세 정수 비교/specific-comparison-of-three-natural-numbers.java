import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == min(a, b, c))
            System.out.print(1 + " ");
        else
            System.out.print(0 + " ");

        if (a == b && a == c && b ==c)
            System.out.print(1);
        else
            System.out.print(0);
    }
}