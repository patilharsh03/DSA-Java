// [Subtract the Product and Sum of Digits of an Integer]
// (https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num =  in.nextInt();

        int sum = 0, mul = 1, temp;
         while (num > 0) {
             temp = num % 10;
             sum = sum + temp;
             mul = mul * temp;
             num = num / 10;
         }
         System.out.println("Difference: " + (mul - sum));
    }
}
