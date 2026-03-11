import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int day1 = 0;
        for (int i = 0; i < m1 - 1; i++) {
            day1 += day[i];
        }
        day1 += d1;

        int day2 = 0;
        for (int i = 0; i < m2 - 1; i++) {
            day2 += day[i];
        }
        day2 += d2;

        int diff = (day1 - day2) % 7;

        int dayOfTheWeek = (7 - diff) % 7;

        System.out.println(days[dayOfTheWeek]);
    }
}