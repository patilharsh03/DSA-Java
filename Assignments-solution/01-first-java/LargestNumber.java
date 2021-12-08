// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        System.out.print("Enter a number: ");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println("Largest Number is: " + num1);
        } else {
            System.out.println("Largest Number is: " + num2);
        }
    }
    

}
