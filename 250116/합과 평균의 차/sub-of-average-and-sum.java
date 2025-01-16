import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b, c, sum, avg;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        sum = a + b + c;
        avg = sum/3;
        
        System.out.printf("%d\n%d\n%d", sum, avg, sum-avg);
    }
}