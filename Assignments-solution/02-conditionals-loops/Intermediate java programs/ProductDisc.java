// Calculate Discount Of Product

import java.util.Scanner;

public class ProductDisc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a price of product: ");
        double price = in.nextDouble();
        double discount = 0;

        if (price > 500) {
            discount = price * 0.1;
        } else if (price > 1000) {
            discount = price * 0.2;
        } else {
            discount = price * 0.3;
        }
        double total = price - discount;

        System.out.println("Total Price of Product: " + total);
        System.out.println("Discount of Product: " + discount);
    }
}
