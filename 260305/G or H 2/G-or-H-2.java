import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] letter = new char[101];
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);

            letter[position] = ch;
            positions[i] = position;
        }
        
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int countG = 0;
                int countH = 0;
                for (int k = positions[i]; k <= positions[j]; k++) {
                    if (letter[k] == 'G') countG++;
                    if (letter[k] == 'H') countH++;
                }
                if ((countG == 0 && countH > 0) 
                    || (countG > 0 && countH == 0)
                    || (countG == countH))
                    maxSize = Math.max(maxSize, positions[j] - positions[i]);
            }
        }

        System.out.println(maxSize);
    }
}