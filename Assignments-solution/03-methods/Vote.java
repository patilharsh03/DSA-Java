import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = in.nextInt();
        System.out.println(eligible(age));
    }

    static String eligible(int age) {
        if (age >= 18) {
            return "Eligible to Vote";
        } else {
            return "You are less than 18 years old.";
        }
    }
}
