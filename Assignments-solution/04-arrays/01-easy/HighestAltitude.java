import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] gain = new int[5];
        System.out.println("Enter altitude points");
        for (int i = 0; i < 5; i++) {
            gain[i] = in.nextInt();
        }
        System.out.println("Maximum Altitude : " + largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            max = Math.max(current, max);
        }
        return max;
    }
}
