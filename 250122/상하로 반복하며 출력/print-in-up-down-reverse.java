import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = i+1;
            for (int j = 0; j < n; j++) {
                System.out.print(num);
                num = n-num+1;
            }
            System.out.println();
        }
    }
}