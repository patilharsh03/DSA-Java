// Write a program to input principal, time, and rate 
// (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // SI = P * R * T
        System.out.print("Enter the Principle Amount: ");
        int p = in.nextInt();

        System.out.print("Enter the Rate: ");
        float r = in.nextFloat();

        System.out.print("Enter the Time: ");
        float t = in.nextFloat();

        float SI = p * r * t;

        System.out.println(SI);
    }
}
