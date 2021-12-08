// Area Of Circle Java Program

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float PI = 3.14f;

        System.out.print("Enter a Radius: ");
        float radius = in.nextFloat();

        float area = PI * radius * radius;

        System.err.println(area);
    }
}
