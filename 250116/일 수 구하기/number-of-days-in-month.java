import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = nextInt();

        if (n == 2)
            System.out.print(28);
        else {
            if (n % 2)
                System.out.print(30);
            else
                System.out.print(31);
        }
    }
}