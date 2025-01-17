import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double a, b, answer;

        a = sc.nextInt();
        b = sc.nextInt();

        answer = (a/b*100000000000000000000.0)/100000000000000000000.0;
        System.out.print(answer);
    }
}