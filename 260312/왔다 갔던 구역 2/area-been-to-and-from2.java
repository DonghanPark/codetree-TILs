import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] coor = new int[2002];
        int start = 1001;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            for (int j = 0; j < x; j++) {
                if (dir == 'R') {
                    coor[start]++;
                    start++;
                }
                else {
                    start--;
                    coor[start]++;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 2002; i++) {
            if (coor[i] >= 2) count++;
        }
        
        System.out.println(count);
    }
}