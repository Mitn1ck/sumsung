import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        int[] b = new int[10];
        char[] c = new char[a.length()];

        for (int i = 0; i < a.length(); i++) {
            c[i] = a.charAt(i);
            b[c[i] - 48]++;
        }

        rec(b, "", a.length());
    }

    public static void rec(int[] a, String b, int c) {
        if (c == 0) {
            System.out.print(b + " ");
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (a[i] > 0)
                if (c != a.length && (i != 0 || b.length() > 0)) {
                    a[i]--;

                    rec(a, b+i, c - 1);
                    a[i]++;
                }
        }



    }
}
