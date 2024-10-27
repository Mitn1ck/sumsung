import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();
        int d = b.length(), left = 0, right = 0, fl = 0;
        b += a;
        int[] c = new int[b.length()];

        for (int i = 1; i < b.length(); i++) {
            if (i <= right)
                c[i] = Math.min(right - i + 1, c[i - left]);

            while (i + c[i] < b.length() && b.charAt(c[i]) == b.charAt(i + c[i]))
                c[i]++;

            if (i + c[i] - 1 > right){
                left = i;
                right = i + c[i] - 1;
            }
        }

        for (int i = d; i < b.length(); i++) {
            if (c[i] >= d) {
                fl = 1;
                System.out.print(i - d + " ");
            }
        }
        if(fl == 0) System.out.println(-1);



    }
}
