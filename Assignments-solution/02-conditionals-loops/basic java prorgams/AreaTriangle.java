// Area Of Triangle

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a height: ");
        float height = in.nextFloat();
        System.out.print("Enter a base: ");
        float base = in.nextFloat();

        float area = (height * base) / 2;

        System.out.println("Area of Triangele: " + area);
    }
}
