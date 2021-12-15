import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // nPr = n!/(n-r)! nCr = n!/[r!

        System.out.print("Enter value of n: ");
        int n = in.nextInt();
        System.out.print("Enter value of r: ");
        int r = in.nextInt();

        if (n >= r) {
            System.out.println(n+"c"+r+": "+ fact(n)/(fact(n-r)*fact(r)));
            System.out.println(n+"p"+r+": "+ fact(n)/(fact(n-r)));
        }
    }

    static int fact(int num) {
        int f = 1;
        for (int i = 1; i < num; i++) {
            f *= i;
        }
        return f;
    }
}
