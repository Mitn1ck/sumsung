import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] b = new int[a];

        for (int i = 0; i < a; i++)
            b[i] = in.nextInt();

        System.out.print(b[0]+ " ");

        for (int i = 1; i < a; i++)
            if (b[i] != b[i-1])
                System.out.print(b[i]+" ");














    }
}
