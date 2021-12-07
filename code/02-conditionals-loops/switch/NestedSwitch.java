import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        // switch (empID) {
        //     case 1:
        //         System.out.println("Harsh Patil");
        //         break;
        //     case 2:
        //         System.out.println("Shubham Patil");
        //         break;
        //     case 3:
        //         System.out.println("Employee Number 3");
        //         switch (department) {
        //             case "IT":
        //                 System.out.println("IT Department");
        //                 break;
        //             case "Management":
        //                 System.out.println("Management");
        //                 break;
        //             default:
        //                 System.out.println("No Department entered");
        //         }
        //         break;
        //     default:
        //         System.out.println("Enter Coreect EmpID");
        // }

        // enhanced switch
        switch (empID) {
            case 1 -> System.out.println("Harsh Patil");
            case 2 -> System.out.println("Shubham Patil");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
