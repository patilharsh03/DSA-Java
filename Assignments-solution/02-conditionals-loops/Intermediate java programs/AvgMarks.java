// Calculate Average Marks

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total numbers of suject: ");
        int sub = in.nextInt();

        int total = 0;

        for (int i = 1; i <= sub; i++) {
            System.out.println("Enter marks of subject: ");
            int temp = in.nextInt();
            total = total + temp;
        }
        System.out.println("Average Marks : " + total / sub);

    }
}
