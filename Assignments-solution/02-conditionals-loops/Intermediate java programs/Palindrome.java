// Find if a number is palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = in.nextInt();

        int temp = num;
        int rev = 0;
        while (temp > 0) {
            rev += temp % 10;
            rev *= 10;
            temp = temp / 10;
        }
        rev = rev / 10;
        if (rev == num){
            System.out.print(num + " is Palindrome");
        } else {
            System.out.print(num + " is not a Palindrome");
        }
    }
}
