// Area Of Isosceles Triangle

import java.util.Scanner;

public class AreaIsosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a base: ");
        float base = in.nextFloat();
        System.out.print("Enter a height: ");
        float height = in.nextFloat();

        float area = (base * height)  / 2;

        System.out.println("Area of Isosceles: " + area);
    }
}
