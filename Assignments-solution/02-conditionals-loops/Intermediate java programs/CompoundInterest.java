// Compound Interest Java Program

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double p = in.nextDouble();
        System.out.print("Enter rate: ");
        double r = in.nextDouble();
        System.out.print("Enter number of times interest applied per time period: ");
        double n = in.nextDouble();

        double CI = (p * (Math.pow((1 + (r / 100)), n))) - p;
        System.out.println("Compound Interest = " + CI);
    }
}
