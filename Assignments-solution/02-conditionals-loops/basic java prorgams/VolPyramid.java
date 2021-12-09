// Volume of Pyramid

import java.util.Scanner;

public class VolPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a base length: ");
        float length = in.nextFloat();
        System.out.print("Enter a width: ");
        float width = in.nextFloat();
        System.out.print("Enter a pyramid height: ");
        float height = in.nextFloat();

        float vol = (length * width * height) / 3;

        System.out.println("Volume of Pyramid: " + vol);
    }
}
