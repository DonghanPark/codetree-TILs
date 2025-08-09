import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

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
        int[] direction = new int[128];
        direction['U'] = 0;
        direction['D'] = 1;
        direction['R'] = 2;
        direction['L'] = 3;
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            final int PERIOD = 2 * N - 1;
            int removedMarbles = 0;

            // Marble[] marbles = new Marble[M];
            ArrayList<Marble> marbles = new ArrayList<>();
            
            for (int i = 0; i < M; i++) {
                int x = sc.nextInt()-1;
                int y = sc.nextInt()-1;
                char d = sc.next().charAt(0);
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
