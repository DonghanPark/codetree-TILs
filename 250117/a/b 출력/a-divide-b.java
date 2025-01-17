import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b, answer;

        a = sc.nextInt();
        b = sc.nextInt();

        answer = (int)((double)a/b*10000000000)/10000000000.0;
        System.out.print(answer);
    }
}