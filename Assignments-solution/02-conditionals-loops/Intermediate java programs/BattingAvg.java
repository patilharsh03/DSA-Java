// Calculate Batting Average

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Runs Scored by Batsman: ");
        long runs = in.nextLong();
        System.out.print("Enter number of times batsman gets out: ");
        long out = in.nextLong();

        long avg = runs / out;

        System.out.println("Batting Average: " + avg);
    }
}
