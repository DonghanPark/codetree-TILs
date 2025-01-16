import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b, c, min;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        min = a < b ? a : b;
        min = c < min ? c : min;

        System.out.print(min); 
    }
}