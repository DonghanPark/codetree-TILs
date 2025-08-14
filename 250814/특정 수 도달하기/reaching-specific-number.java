import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int stopIndex = -1;
        int sum = 0;
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            
            if (array[i] >= 250) {
                stopIndex = i;
                break;
            }
            
            sum += array[i];
        }

        if (stopIndex != -1) {
            System.out.printf("%d %.1f", sum, (double)sum / stopIndex);
        }
        else {
            System.out.printf("%d %.1f", sum, (double)sum / 10);
        }

    }
}