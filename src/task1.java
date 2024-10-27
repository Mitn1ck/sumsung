import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), fl = 1;

        while (a > 0) {
            if (a % 10 == 0 && fl == 1) {
                a /= 10;
                continue;
            }
            else if (fl == 1) {
                fl = 0;
                System.out.print(a % 10);
            }
            else
                System.out.print(a % 10);

            a /= 10;
        }









    }
}
