// Area Of Parallelogram

import java.util.Scanner;

public class AreaParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a base: ");
        float base = in.nextFloat();
        System.out.print("Enter a height: ");
        float height = in.nextFloat();

        float area = base * height;

        System.out.println(area);
    }
}
