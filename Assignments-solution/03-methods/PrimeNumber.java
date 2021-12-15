import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter start number: ");
        int start = in.nextInt();
        System.out.print("Enter end number: ");
        int end = in.nextInt();
        System.out.println("All prime numbers between " + start + " and " + end + ": ");
        prime(start, end);
    }

    static void prime(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
