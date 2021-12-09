// Total Surface Area of Cube

import java.util.Scanner;

public class TsaCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a side length: ");
        float side_len = in.nextFloat();

        float TSA = 6 * side_len * side_len;

        System.out.println("Total Surface Area of Cube: " + TSA);
    }
}
