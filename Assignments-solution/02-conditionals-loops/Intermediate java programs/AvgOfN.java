// Calculate Average Of N Numbers

import java.util.Scanner;

public class AvgOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you want to enter? : ");
        int n = in.nextInt();
        int sum = 0;
        System.out.println("Enter numbers: ");

        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            sum = sum + temp;
        }
        System.out.println("Average of "+n+" numbers : "+sum / n);
    }
}
