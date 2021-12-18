import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] accounts = new int[3][2];
        System.out.println("Enter each customers bank wealth");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                accounts[i][j] = in.nextInt();
            }
        }
    }

    static int maximumWealth(int[][] accounts) {
        int sum = 0; max = 0;
        for (int customer = 0; customer < accounts.length; customer++) {
            sum = 0;
            for (int bank = 0; bank < accounts[customer].length; bank++) {
                sum = sum + accounts[customer][bank];
            }
            if (sum > max) {
                max = sum;
            }
            return max;
        }
    }
}
