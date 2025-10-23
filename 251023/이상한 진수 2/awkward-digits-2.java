import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.equals(a.replaceFirst("0", "1")))
            a = a.replaceFirst("1", "0");
        else
            a = a.replaceFirst("0", "1");

        int decimalNumber = Integer.parseInt(a, 2);

        System.out.println(decimalNumber);
    }
}