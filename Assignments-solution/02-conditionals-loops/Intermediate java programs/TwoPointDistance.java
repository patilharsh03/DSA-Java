// Calculate Distance Between Two Points

import java.util.Scanner;

public class TwoPointDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double distance = 0;

        System.out.println("Enter the Coordinates of the first point (x1, y1)");
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        System.out.println("Enter the coordinates of the second point (x2, y2)");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The Distance Between the two points: " + distance);
    }
}