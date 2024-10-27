import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = 0;


        while (b != 0){
            c = (a & b) << 1;
            a = a ^ b;
            b = c;
        }
        System.out.print(a);
    }
}
