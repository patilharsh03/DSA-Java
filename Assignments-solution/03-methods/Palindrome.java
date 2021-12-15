import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        System.out.println(pali(num));
    }

    static String pali(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            rev = rev + temp % 10;
            rev = rev * 10;
            temp = temp / 10;
        }
        rev = rev / 10;
        if (rev == num){
            return num + " is Palindrome";
        } else {
            return num + " is not a Palindrome";
        }
    }
}
