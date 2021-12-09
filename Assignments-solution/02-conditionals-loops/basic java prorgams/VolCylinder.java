// Volume of Cylinder

import java.util.Scanner;

public class VolCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float PI = 3.14f;

        System.out.print("Enter a radius: ");
        float radius = in.nextFloat();
        System.out.print("Enter a height: ");
        float height = in.nextFloat();

        float vol = PI * radius * radius * height;

        System.out.println("Volume of Cylinder: " + vol);
    }
}
