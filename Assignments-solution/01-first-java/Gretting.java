import java.util.Scanner;

// Take name as input and print a greeting message for that
// name.

public class Gretting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = in.next();

        System.out.println("Hello " + name);
    }
    
}
