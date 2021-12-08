// Perimeter Of Rhombus

import java.util.Scanner;

public class PeriRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a side: ");
        float side = in.nextFloat();

        float peri = 4 * side;

        System.out.println("Perimeter of Rhombus: " + peri);
    }
}
