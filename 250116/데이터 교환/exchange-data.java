public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp = 0;

        temp = b;
        b = a;
        a = c;
        c = temp;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}