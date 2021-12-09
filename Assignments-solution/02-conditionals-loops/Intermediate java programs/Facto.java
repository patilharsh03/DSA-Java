// Factorial Program In Java

import java.util.Scanner;

public class Facto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fact = 1;

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + ": " + fact);
    }
}
