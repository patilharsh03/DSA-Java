import java.util.Scanner;

public class SumOfDigitNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = in.nextInt();

        int ans = 0;

        while (num > 0) {
            ans += num % 10;
            num = num / 10;
        }
        System.out.println("Sum : " + ans);
    }
}
