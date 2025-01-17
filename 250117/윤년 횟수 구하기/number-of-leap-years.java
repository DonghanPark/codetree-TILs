import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n, count;

        n = sc.nextInt();
        count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0)
                count++;
            if (i % 100 == 0 && i % 400 != 0)
                count--;
        }

        System.out.println(count);
    }
}