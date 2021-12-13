// Write a program to print the circumference and area of a 
// circle of radius entered by user by defining your own 
// method.
// (https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/)

import java.util.Scanner;

public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a radius : ");
        int rad = in.nextInt();
        System.out.println("Circumference : " + circumference(rad));
        System.out.println("Area : " + area(rad));
    }

    static double area(int rad) {
        double ar = 3.14 * rad * rad;
        return ar;
    }

    static double circumference(float rad) {
        double cir = 2 * 3.14 * rad;
        return cir;
    }
}
