// Write a program to print the sum of two numbers entered 
// by user by defining your own method.
// (https://code4coding.com/addition-of-two-numbers-in-java-using-method/)

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = in.nextInt();
        System.out.println("Sum : " + sum(num1, num2));
    }

    static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
