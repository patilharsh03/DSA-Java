// Curved Surface Area of Cylinder

import java.util.Scanner;

public class CurvedSurfaceArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float PI = 3.14f;

        System.out.print("Enter a radius: ");
        float radius = in.nextFloat();
        System.out.print("Enter a height: ");
        float height = in.nextFloat();

        float vol = 2 * PI * radius * height;

        System.out.println("Curved Surface Area of Cylinder: " + vol);
    }
}
