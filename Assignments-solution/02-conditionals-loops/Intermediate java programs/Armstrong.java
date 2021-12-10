// Armstrong Number In Java

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = in.nextInt();
        int num1 = n;
        int check = 0;
        while(n > 0) {
            int temp = n % 10;
            check += (temp * temp * temp);
            n = n / 10;
        }
        if (check == num1) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
