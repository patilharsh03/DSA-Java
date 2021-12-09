// Calculate Electricity Bill

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter untis consumed: ");
        double units = in.nextDouble();
        System.out.print("Enter Price per unit: ");
        int price = in.nextInt();
        
        System.out.println("Electricity bill : "+price * units);

    }
}
