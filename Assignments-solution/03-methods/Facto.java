import java.util.Scanner;

public class Facto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = in.nextInt();
        System.out.println("Factorial of " + num + " is: " + facto(num));
    }

    static int facto(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}