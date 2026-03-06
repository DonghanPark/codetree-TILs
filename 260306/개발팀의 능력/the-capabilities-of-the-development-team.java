import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] power = new int[5];
        int TOTAL_POWER = 0;
        int HUMAN = 5;
        
        for (int i = 0; i < 5; i++) {
            power[i] = sc.nextInt();
            TOTAL_POWER += power[i];
        }
        
        int minGap = 5001;
        for (int i = 0; i < HUMAN; i++) {
            for (int j = 0; j < HUMAN; j++) {
                for (int k = 0; k < HUMAN; k++) {
                    if (i == j || j == k || i == k) continue;
                    int team1 = power[i] + power[j];
                    int team2 = power[k];
                    int team3 = TOTAL_POWER - team1 - team2;
                
                    if (team1 == team2 || team2 == team3 || team1 == team3) continue;

                    int minPower = Math.min(team1, Math.min(team2, team3));
                    int maxPower = Math.max(team1, Math.max(team2, team3));

                    minGap = Math.min(minGap, maxPower - minPower);
                }
            }
        }

        System.out.println(minGap);
    }
}