// Volume of Sphere

import java.util.Scanner;

public class VolSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float PI = 3.14f;

        System.out.print("Enter a radius: ");
        float radius = in.nextFloat();

        float vol = (4 / 3) * PI * radius * radius * radius;

        System.out.println("Volume of Sphere: " + vol);
    }    
}
