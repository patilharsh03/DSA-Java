// Define a method to find out if a number is prime or not.
// (https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
