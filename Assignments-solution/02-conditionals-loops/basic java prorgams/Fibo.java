// Fibonacci Series In Java Programs

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int prev = 0;
        int next = 1;
        int n;

        System.out.print(prev + " " + next);

        for (int i = 2; i < num; i++) {
            n = prev + next;
            System.out.print(" " + n);
            prev = next;
            next = n;  
        }
    }
}
