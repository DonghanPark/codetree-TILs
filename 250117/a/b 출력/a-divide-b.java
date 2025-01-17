import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b, answer = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 0; i < 21; i++) {
            System.out.print(a/b);
            a = (a % b) * 10;
            if(i == 0)
                System.out.print(".");
        }
    }
}