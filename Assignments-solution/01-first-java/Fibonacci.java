// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = in.nextInt();

        int prev = 0;
        int next = 1, n;

        System.out.print(prev + " " + next);

        for(int i= 2; i < num; i++){
            n = prev + next;
            System.out.print(" " + n);
            prev = next;
            next = n;
        }
    }
}
