// Perimeter Of Equilateral Triangle

import java.util.Scanner;

public class PeriEquiTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a side: ");
        float side = in.nextFloat();

        float perimeter = 3 * side;

        System.out.println("Area of equilateral triangle: " + perimeter);
    }
}
