// Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Currency in Indian Rupees: ");
        float inr = in.nextFloat();

        System.out.println("Currency in US$ " + (0.013 * inr));
    }

    
}
