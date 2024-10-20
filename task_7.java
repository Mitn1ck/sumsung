import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int[][] b = new int[a][a];
        
        for (int i = 0; i < a; i++)
            for (int j = 0; j < a; j++)
                if(j <= i)
                    b[i][j] = in.nextInt();
            
        
        for (int i = a - 2; i >= 0; i--)
            for (int j = 0; j < a; j++)
                if(j <= i) 
                    b[i][j] += Math.max(b[i+1][j], b[i+1][j+1]);
            
        
        System.out.print(b[0][0]);
    }
}
