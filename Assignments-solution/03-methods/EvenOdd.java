// Define a program to find out whether a given number is 
// even or odd.]
// (https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/)

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = in.nextInt();
        System.out.println(check(num));
    }

    static boolean check(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
