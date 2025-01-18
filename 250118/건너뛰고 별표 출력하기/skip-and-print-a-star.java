import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;

        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.print("\n\n");
            if (count < 4)
                count++;
            else
                count--;
        }
    }
}