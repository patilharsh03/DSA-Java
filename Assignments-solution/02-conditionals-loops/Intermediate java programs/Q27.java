import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long negative = 0;
        long even = 0;
        long odd = 0;

        System.out.println("Enter Numbers: ");
        int temp = in.nextInt();

        while (temp != 0) {
            if (temp < 0) {
                negative += temp;
            }
            if (temp > 0) {
                if (temp % 2 == 0) {
                    even += temp;
                } else {
                    odd += temp;
                }
                temp = in.nextInt();
            }
            System.out.println("Sum of Negative Numbers : " + negative);
            System.out.println("Sum of Positive Even Numbers : " + even);
            System.out.println("Sum of Positive Odd Numbers : " + odd);
        }
    }
}
