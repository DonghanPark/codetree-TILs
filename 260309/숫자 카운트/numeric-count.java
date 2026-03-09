import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }
        
        int answer = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    if (i == j || j == k || k == i) continue;


                    int count = 0;
                    for (int l = 0; l < n; l++) {
                        int oneCount = 0;
                        int twoCount = 0;

                        if (num[l] / 100 == i) oneCount++;
                        if ((num[l] % 100) / 10 == i) twoCount++;
                        if ((num[l] % 10) == i) twoCount++;
                        
                        if (num[l] / 100 == j) twoCount++;
                        if ((num[l] % 100) / 10 == j) oneCount++;
                        if ((num[l] % 10) == j) twoCount++;
                        
                        if (num[l] / 100 == k) twoCount++;
                        if ((num[l] % 100) / 10 == k) twoCount++;
                        if ((num[l] % 10) == k) oneCount++;

                        if (count1[l] == oneCount && count2[l] == twoCount)
                            count++;
                    }
                    
                    if (count == n) answer++;
                }
            }
        }

        System.out.println(answer);
    }
}