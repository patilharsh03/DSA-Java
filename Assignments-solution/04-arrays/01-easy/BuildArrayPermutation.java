import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter array: ");
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(permutation(arr)));

    }

    public static int[] permutation(int arr[]) {
        int[] permutation = new int[arr.length];
        for (int i = 0; i < permutation.length; i++) {
            permutation[i] = arr[arr[i]];
        }
        return permutation;
    }
}
