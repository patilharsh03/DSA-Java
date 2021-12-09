// Take integer inputs till the user enters 0 and print the 
// largest number from all.

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        int largest = 0, num;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        do {
            num = in.nextInt();
            if (num > largest) {
                largest = num;
            }
        } while (num != 0);
        System.out.println("Largest = " + largest);
    }
}
