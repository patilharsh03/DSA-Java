// Define a method that returns the product of two numbers 
// entered by user.]
// (https://code4coding.com/java-program-to-multiply-two-numbers-using-method/)

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = in.nextInt();
        System.out.println("Product : " + mul(num1, num2));
    }

    static int mul(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }
}
