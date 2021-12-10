// Calculate Depreciation of Value

import java.util.Scanner;

public class Deprication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the buying amount: ");
        long amount = in.nextLong();
        System.out.print("Enter the depreciation percentage: ");
        long dep = in.nextLong();
        System.out.print("How old is product in years: ");
        long product = in.nextLong();

        long temp = amount;

        for (int i = 0; i < product; i++) {
            temp = ((100 - dep) * temp) / 100;
            System.out.println("After Depreciation: " + temp);
        }
    }
}
