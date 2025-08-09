import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
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

    public static void main(String[] args) {
        Map<Character, Integer> direction = new HashMap<>();
        direction.put('U', 0);
        direction.put('D', 1);
        direction.put('R', 2);
        direction.put('L', 3);
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Marble[] marbles = new Marble[50*50];
        while(T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            final int PERIOD = 2 * N - 1;
            int removedMarbles = 0;

            
            for (int i = 0; i < M; i++) {
                int x = sc.nextInt()-1;
                int y = sc.nextInt()-1;
                char d = sc.next().charAt(0);
                marbles[i] = new Marble(x, y, direction.get(d));
            }

            for (int i = 0; i < PERIOD; i++) {
                // move
                int[][] grid = new int[N][N];
                for (int j = 0; j < M; j++) {
                    int x = marbles[j].x;
                    int y = marbles[j].y;
                    int d = marbles[j].d;
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    
                    // valid range
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N) { 
                        marbles[j].x = nx;
                        marbles[j].y = ny;
                        grid[nx][ny] += 1;
                    }
                    // change direction
                    else {
                        if (d >= direction.get('R')) {
                            marbles[j].d = (d + 1) % 2 + 2;
                        }
                        else {
                            marbles[j].d = (d + 1) % 2;
                        }

                        if (x < N && y < N)
                            grid[x][y] += 1;
                    }
                }

                // check collision
                for (int j = 0; j < M; j++) {
                    int x = marbles[j].x;
                    int y = marbles[j].y;

                    if (x < N && y < N && grid[x][y] > 1) {
                        marbles[j].x = N;
                        marbles[j].y = N;
                        removedMarbles++;
                    }
                }
            }

            System.out.println(M - removedMarbles);
        }
    }
}
