// Calculate Commission Percentage

import java.util.Scanner;

public class Comm_per {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your sell amount: ");
        double sell = in.nextDouble();
        System.out.print("Enter commission amount: ");
        double amount = in.nextDouble();

        System.out.println("Commission Percentage: " + (amount/sell) * 100 + " %");

    }
}
