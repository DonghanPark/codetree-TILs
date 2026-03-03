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

        int[] patternFreq = new int[101];
        int[] windowFreq = new int[101];

        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
            patternFreq[B[i]]++;
            windowFreq[A[i]]++;
        }

        int answer = 0;
        if (isSameFrequency(patternFreq, windowFreq)) answer++;
        
        for (int i = M; i < N; i++) {
            windowFreq[A[i]]++;
            windowFreq[A[i-M]]--;

            if (isSameFrequency(patternFreq, windowFreq)) answer++;
        }
        
        System.out.println(answer);
    }

    private static boolean isSameFrequency(int[] A, int[] B) {
        for (int i = 1; i < 101; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }
}
