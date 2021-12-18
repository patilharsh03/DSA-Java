import java.util.Arrays;
import java.util.Scanner;

public class Running_SumArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[4];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < 4; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] rsum = new int[nums.length];
        int sum = nums[0];
        rsum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            rsum[i] = sum + nums[i];
            sum = rsum[i];
        }
        return rsum;
    } 
}
