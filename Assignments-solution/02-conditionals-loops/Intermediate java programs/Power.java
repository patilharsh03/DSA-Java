// Power In Java

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = in.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = in.nextInt();

        int power = 1;
        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }
        System.out.println("Power: " + power);
    }
}
