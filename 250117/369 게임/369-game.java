import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isThreeTimes(i) || contains369(i))
                System.out.print(0 + " ");
            else
                System.out.printf("%d ", i);
        }
    }

    public static boolean isThreeTimes(int num) {
        if (num % 3 == 0)
            return true;
        
        return false;
    }

    public static boolean contains369(int num) {
        while(num != 0) {
            if ((num % 10) % 3 == 0)
                return true;
            num /= 10;
        }
        return false;
    }
}