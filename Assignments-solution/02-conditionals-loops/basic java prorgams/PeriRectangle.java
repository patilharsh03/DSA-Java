// Perimeter of Rectangle

import java.util.Scanner;

public class PeriRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a length: ");
        float length = in.nextFloat();
        System.out.print("Enter a width: ");
        float width = in.nextFloat();

        float peri = 2 * (length + width);

        System.out.println("Perimeter of Rectangle: " + peri);
    }
}
