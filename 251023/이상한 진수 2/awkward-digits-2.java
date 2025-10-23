import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.equals(a.replaceFirst("0", "1"))) {
            int lastIndex = a.lastIndexOf("1");
            String part1 = a.substring(0, lastIndex);
            String part2 = a.substring(lastIndex + 1);
            a = part1 + "0" + part2;
        }
        else
            a = a.replaceFirst("0", "1");

        int decimalNumber = Integer.parseInt(a, 2);

        System.out.println(decimalNumber);
    }
}