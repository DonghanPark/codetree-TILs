import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (M > N) {
            System.out.println(0);
            return;
        }

        int[] count = new int[101];
        int[] count2 = new int[101];
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
            count[B[i]]++;
            count2[A[i]]++;
        }

        

        int answer = 0;
        boolean flag = false;
        for (int i = 1; i < 101; i++) {
            if (count[i] != count2[i]) {
                flag = true;
                break;
            }
        }
        if (!flag) answer++;
        
        for (int i = M; i < N; i++) {
            flag = false;

            count2[A[i]]++;
            count2[A[i-M]]--;

            for (int j = 1; j < 101; j++) {
                if (count[j] != count2[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) answer++;
        }
        
        System.out.println(answer);
    }
}
