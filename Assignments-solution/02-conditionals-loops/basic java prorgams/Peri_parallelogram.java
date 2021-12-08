// Perimeter of Parallelogram

import java.util.Scanner;

public class Peri_parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a base: ");
        float base = in.nextFloat();
        System.out.print("Enter a side: ");
        float side = in.nextFloat();

        float perimeter = 2 *(base + side);

        System.out.println("Perimeter of parallelogram: " + perimeter);
    }
}
