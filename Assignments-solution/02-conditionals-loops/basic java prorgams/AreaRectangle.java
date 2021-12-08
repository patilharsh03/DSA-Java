// Area Of Rectangle

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a width: ");
        float width = in.nextFloat();
        System.out.print("Enter a length: ");
        float length = in.nextFloat();

        float area = width * length;

        System.out.println("Area of Rectangle: " + area);
    }
}
