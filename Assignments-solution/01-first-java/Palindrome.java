// To find out whether the given String is Palindrome or 
// not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String palindrome = input.next();

        for(int i = 0; i < ((palindrome.length() - 1) / 2); i++) {
            if (palindrome.charAt(palindrome.length() - (i + 1)) != palindrome.charAt(i)) {
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
