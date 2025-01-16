import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        String phone;
        char temp;
        
        String firstPhoneNum = sc.next();
        String secondPhoneNum = sc.next();
        String thirdPhoneNum = sc.next();

        System.out.printf("%s-%s-%s", firstPhoneNum, thirdPhoneNum, secondPhoneNum);
    }
}