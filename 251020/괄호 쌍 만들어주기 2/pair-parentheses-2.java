import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = 0;

        for (int i = 0; i < input.length() - 3; i++) {
            for (int k = i + 2; k < input.length() - 1; k++) {
                if (input.charAt(i) == '(' &&
                    input.charAt(i+1) == '(' &&
                    input.charAt(k) == ')' &&
                    input.charAt(k+1) == ')') {
                        count++;
                }
            }
        }

        System.out.println(count);
    }
}