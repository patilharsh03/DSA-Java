// Take in two numbers and an operator (+, -, *, /) and 
// calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a First Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter a Operator: ");
        char op = in.next().trim().charAt(0);
        System.out.print("Enter a Second Number: ");
        int num2 = in.nextInt();

        

        if (op == '+') {
            System.out.println(num1 + num2);
        } else if (op == '-') {
            System.out.println(num1 - num2);
        } else if (op == '*') {
            System.out.println(num1 * num2);
        } else if (op == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("please enter a valid operator");
        }
    }
}
