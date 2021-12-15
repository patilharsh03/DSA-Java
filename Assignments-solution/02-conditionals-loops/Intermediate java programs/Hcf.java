import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("HCF : " + hcf(num1, num2));
    }

    static int hcf(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return hcf(num2, num1 % num2);
        }
    }
}
