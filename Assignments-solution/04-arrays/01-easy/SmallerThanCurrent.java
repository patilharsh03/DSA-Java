import java.util.Arrays;
import java.util.Scanner;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter Numbers");
        for (int i = 0; i < 5; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Entered Array: " + Arrays.toString(nums));
        System.out.println("Number of element less than each element: " + Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            c = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    c++;
                }
            }
            arr[i] = c;
        }
        return arr;
    }
}
