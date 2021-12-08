// Volume of Cone

import java.util.Scanner;

public class VolCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float PI = 3.14f;

        System.out.print("Enter a radius: ");
        float radius = in.nextFloat();
        System.out.print("Enter a height: ");
        float height = in.nextFloat();

        float volume = (PI * radius * radius) * height / 3;

        System.out.println("Volume of Cone: " + volume);
    }
}
