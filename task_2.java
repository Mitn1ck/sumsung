import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = "";
        int c = 1;

        for (int i = 1; i < a.length(); i++){
            if (a.charAt(i) == a.charAt(i - 1)) 
                c++;
            
            else{
                b += a.charAt(i - 1)  +""+ c;
                c = 1;
            }
        }

        if (a.length() > 0) 
            b += a.charAt(a.length() - 1)+""  + c;
        
        System.out.print(b);
   
   
   
   
   
   
   
   
   
    }
}
