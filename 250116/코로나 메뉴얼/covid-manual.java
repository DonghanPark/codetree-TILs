import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char sick;
        int temp, emer = 0;

        for(int i = 0; i < 3; i++) {
            sick = sc.next().charAt(0);
            temp = sc.nextInt();

            if (sick == 'Y' && temp >= 37)
                // System.out.print('A');
                emer += 1;
            // else if (sick == 'N' && temp >= 37)
            //     System.out.print('B');
            // else if (sick == 'Y' && temp < 37)
            //     System.out.print('C');
            // else
            //     System.out.print('D');
        }

        if (emer >= 2)
            System.out.print('E');
        else
            System.out.print('N');
    }
}