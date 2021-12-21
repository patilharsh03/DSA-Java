import java.util.*;

public class Kids_GreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        int max=0;
        for(int candy: candies){
            max=Math.max(candy,max);
        }
        for(int candy:candies){
            list.add(candy+extraCandies>=max);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] candies = new int[5];
        System.out.println("Enter candies with each kid");
        for (int i = 0; i < 5 ; i++) {
            candies[i]=in.nextInt();
        }
        System.out.println("Enter number of extra candies");
        int extraCandies=in.nextInt();
        System.out.println((kidsWithCandies(candies,extraCandies)));
    }
}