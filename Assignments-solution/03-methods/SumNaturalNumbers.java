import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = in.nextInt();
        System.out.println(findSum(num));
    }

    static int findSum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;    
        }
        return sum;
    }
}
