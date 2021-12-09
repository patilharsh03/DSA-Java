// Take integer inputs till the user enters 0 and print the 
// sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        int sum = 0, num;

        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        do {
            num = in.nextInt();
            sum = sum + num;
        } while (num != 0);
        System.out.println("Sum = " + sum);
    }
}
