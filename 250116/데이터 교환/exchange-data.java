public class Main {
    public static void main(String[] args) {
        int a, b, c = 5, 6, 7;
        int temp = 0;

        temp = b;
        b = a;
        a = temp;

        temp = c;
        c = a;
        a = temp;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}