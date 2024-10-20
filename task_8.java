import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        rec(a, 0, 2, 1);
    }
    public static void rec(int a, int from, int to, int mid) { 
        
        char[] b = {'A','B','C'};
        
        if (a > 0){
            rec(a - 1, from, mid, to);
            System.out.println("Move disk " + a + " from " + b[from] + " to " + b[to]);
            rec(a - 1, mid, to, from);
        }
        
        
    }
}
