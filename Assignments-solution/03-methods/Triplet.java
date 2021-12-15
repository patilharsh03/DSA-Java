import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter third number: ");
        int num3 = in.nextInt();
        System.out.println(triplet(num1, num2, num3));
    }

    static String triplet(int num1, int num2, int num3) {
        // A Pythagorean triplet is when the sum of the square 
        // of two numbers is equal to the square of the third 
        // number
        if (num1 * num1 + num2 * num2 == num3 * num3) {
            return "Triplet is a Pythagorean triplet";
        } else {
            return "Triplet is not a Pythagorean triplet";
        }
    }
}
