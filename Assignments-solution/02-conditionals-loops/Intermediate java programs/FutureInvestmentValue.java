import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double pv = in.nextDouble();
        System.out.print("Enter interest rate: ");
        double rate = in.nextDouble();
        System.out.print("Enter a time in years: ");
        double year = in.nextDouble();

        double fv = pv * Math.pow((1 + rate / 100), year);

        System.out.print("Future Investment is: " + fv);
    }
}
