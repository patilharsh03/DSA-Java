import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();

        // switch (fruit) {
        //     case "mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "apple":
        //         System.out.println("Red fruit");
        //         break;
        //     case "orange":
        //         System.out.println("round fruits");        
        //         break;
        //     case "grapes":
        //         System.out.println("Smallest fruit");    
        //     default:
        //         System.out.println("please enter a valid fruit");
        // }


        // Enhanced switch statements

        // switch (fruit) {
        //     case "Mango" -> System.out.println("King of fruits");
        //     case "Apple" -> System.out.println("A sweet red fruit");
        //     case "Orange" -> System.out.println("Round fruit");
        //     case "Grapes" -> System.out.println("Small fruit");
        //     default -> System.out.println("please enter a valid fruit");
        // }

        int day = in.nextInt();

        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednedsday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }

        // switch (day) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.out.println("Weekdays");
        //         break;
        //     case 6:
        //     case 7:
        //         System.out.println("Weekends");    
        // }

        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekends");
        }
    }
}
