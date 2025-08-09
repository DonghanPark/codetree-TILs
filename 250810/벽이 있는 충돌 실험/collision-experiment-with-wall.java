import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    static class Marble {
        int x;
        int y;
        int d;

        Marble(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    public static void main(String[] args) throws IOException{
        int[] direction = new int[128];
        direction['U'] = 0;
        direction['D'] = 1;
        direction['R'] = 2;
        direction['L'] = 3;
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // Scanner sc = new Scanner(System.in);
        // int T = sc.nextInt();
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());
            // int N = sc.nextInt();
            // int M = sc.nextInt();
            int N = Integer.parseInt(st.nextToken());;
            int M = Integer.parseInt(st.nextToken());;
            
            final int PERIOD = 2 * N - 1;
            int removedMarbles = 0;

            // Marble[] marbles = new Marble[M];
            ArrayList<Marble> marbles = new ArrayList<>();
            
            for (int i = 0; i < M; i++) {
                // int x = sc.nextInt()-1;
                // int y = sc.nextInt()-1;
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken())-1;
                int y = Integer.parseInt(st.nextToken())-1;
                char d = st.nextToken().charAt(0);
                // marbles[i] = new Marble(x, y, direction.get(d));
                marbles.add(new Marble(x, y ,direction[d]));
            }

            for (int i = 0; i < PERIOD; i++) {
                // move
                int[][] grid = new int[N][N];
                for (int j = 0; j < marbles.size(); j++) {
                    int x = marbles.get(j).x;
                    int y = marbles.get(j).y;
                    int d = marbles.get(j).d;
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    
                    // valid range
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N) { 
                        marbles.get(j).x = nx;
                        marbles.get(j).y = ny;
                        grid[nx][ny] += 1;
                    }
                    // change direction
                    else {
                        d = d ^ 1;
                        marbles.get(j).d = d;
                        grid[x][y] += 1;
                    }
                }

                // check collision
                ArrayList<Marble> marblesToRemove = new ArrayList<>();
                for (int j = 0; j < marbles.size(); j++) {
                    int x = marbles.get(j).x;
                    int y = marbles.get(j).y;

                    if (grid[x][y] > 1) {
                        marblesToRemove.add(marbles.get(j));
                        removedMarbles++;
                    }
                }

                // remove marbles
                for (int j = 0; j < marblesToRemove.size(); j++) {
                    marbles.remove(marblesToRemove.get(j));
                }
            }

            System.out.println(M - removedMarbles);
        }
    }
}
