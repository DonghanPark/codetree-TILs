import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] array = new char[10];
        for (int i = 0; i < 10; i++) {
            array[i] = st.nextToken().charAt(0);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}