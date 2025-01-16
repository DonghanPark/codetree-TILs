import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String phone;
        char temp;
        
        phone = sc.next();

        for (int i = 4; i < 8; i++) {
            temp = phone[i];
            phone[i] = phone[i+5];
            phone[i+5] = temp;
        }

        System.out.print(phone);
    }
}