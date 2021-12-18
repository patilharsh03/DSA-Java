import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Enter elements: ");
        for (int i = 0; i < 3; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Concatenated array: " + Arrays.toString(getConcatenation(nums)));
    }

    public static int [] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < ans.length; i++) {
            if (i < nums.length) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[1 - nums.length];
            }
        }
        return ans;
    }
}
