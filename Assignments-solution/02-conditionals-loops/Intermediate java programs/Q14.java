// Sum Of N Numbers

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("how many numbers you want to enter: ");
        int num = in.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter number: ");
            int temp = in.nextInt();
            sum = sum + temp;
        }
        System.out.println("Sum = " + sum);
    }
}
