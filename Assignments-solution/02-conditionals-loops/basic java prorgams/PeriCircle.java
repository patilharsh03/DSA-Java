// Perimeter of Circle

import java.util.Scanner;

public class PeriCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float PI = 3.14f;

        System.out.print("Enter a radius: ");
        float r = in.nextFloat();
        
        float perimeter = 2 * PI * r * r;

        System.out.println("Perimeter of Circle: " + perimeter);
    }
}
