import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        /*
            Syntax of for loops:

            for(initialisation; condition; increment/decrement){
                // body
            }
        */

        // Q. print numbers from 1 to 100
        // for (int i = 1; i <= 100; i++) {
        //     System.out.println(i);
        // }

        // print numbers from 1 to n
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for (int num = 1; num <= n; num++) {
        //     // System.out.print(num + " ");
        //     System.out.println("Hello World");
        // }

        // while loops
        /*
            Synatax:
            while (condition) {
                // body
            }
        */

        int num = 1;
        while (num <= 5) {
            // System.out.println(num);
            num += 1;
        }

        // do whie loop 
        /*
            Syntax:
                do {
                    // body
                } while (condition);
        */

        int n = 1;
        do {
            // System.out.println(n);
            System.out.println("Hello World");
            // n++;
        } while (n != 1);
    }
}
