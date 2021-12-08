// Area of Rhombus

import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a first diagonal: ");
        float p = in.nextFloat();
        System.out.print("Enter a second diagonal: ");
        float q = in.nextFloat();

        float area = (p * q) / 2;

        System.out.println("Area of Rhombus: " + area);
    }
}
