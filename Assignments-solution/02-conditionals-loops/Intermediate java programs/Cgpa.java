// Calculate CGPA Java Program

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Total marks out of 500: ");
        double marks = in.nextDouble();
        double CGPA = ((marks / 500) * 100) / 9.5;

        System.out.println("CGPA : " + CGPA);
    }
}
