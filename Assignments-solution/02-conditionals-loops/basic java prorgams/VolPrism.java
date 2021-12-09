// Volume of Prism

import java.util.Scanner;

public class VolPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a base area: ");
        float base_area = in.nextFloat();

        System.out.print("Enter a length: ");
        float length = in.nextFloat();

        float vol = base_area * length;

        System.out.println("Volume of Prism: " + vol);
    }
}