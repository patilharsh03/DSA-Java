// Define two methods to print the maximum and the minimum 
// number respectively among three numbers entered by the 
// user.
// (https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();
        
        System.out.println("Maximum : " + max(a, b, c));
        System.out.println("Minimum : " + min(a, b, c));
    }

    static int max(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > c && b > a) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c) {
        int min;
        if (a < b && a < c) {
            min = a;
        } else if (b < c && b < a) {
            min = b;
        } else {
            min = c;
        }
        return min;
    }
}
