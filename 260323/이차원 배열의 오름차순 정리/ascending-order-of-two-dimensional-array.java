import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        ArrayList<Integer> nums =  new ArrayList<>(); 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                nums.add(i*j);
            }
        }

        Collections.sort(nums);

        System.out.println(nums.get(k - 1));
    }
}