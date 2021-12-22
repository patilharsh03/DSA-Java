import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetArray {
        public static int[] createTargetArray(int[] nums, int[] index) {
            ArrayList<Integer> arr= new ArrayList<>();
            for(int i=0; i<nums.length; i++)
            {
                arr.add(index[i],nums[i]);
            }
            int[] target = new int[nums.length];
            for(int i=0; i<nums.length; i++)
            {
                target[i]= arr.get(i);
            }
            return target;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] nums = new int[5];
            int[] index = new int[5];
            System.out.println("Enter number array");
            for(int i=0; i<5; i++)
            {
                nums[i]=in.nextInt();
            }
            System.out.println("Enter index array");
            for(int i=0; i<5; i++)
            {
                index[i]=in.nextInt();
            }
            System.out.println("Target Array: "+ Arrays.toString(createTargetArray(nums,index)));
    
        }
    }

