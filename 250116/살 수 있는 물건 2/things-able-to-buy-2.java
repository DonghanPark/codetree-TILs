import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String out = null;

        if (n >= 3000)
            out = "book";
        else if (n >= 1000)
            out = "mask";
        else if (n >= 500)
            out = "pen";
        else
            out = "no";

        System.out.print(out);
    }
}