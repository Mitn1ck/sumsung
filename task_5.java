import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (b == 1 || b == 2) {
            b += 12;
            c--;
        }
        
        int h = (a + (13 * (b + 1) ) / 5 + (c % 100) + (c % 100) / 4 + (c / 100) / 4 -2 * (c / 100) ) % 7;
        switch (h){
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }
    }
}
