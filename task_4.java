import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine(), b = s.nextLine();
        a=a.toLowerCase();
        b=b.toLowerCase();
        int c = a.length();
        for(int i = 0; i < a.length(); i++)
            for(int j = 0; j < a.length(); j++)
                if(a.charAt(i) == b.charAt(j)){
                    c--;
                    break;
                }
        System.out.print(c == 0? "Yes" : "No");
    }
}
