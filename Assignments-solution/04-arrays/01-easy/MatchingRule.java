import java.util.ArrayList;
import java.util.Scanner;

public class MatchingRule {
    public static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        String t;
        int ctr = 0;
        switch (ruleKey) {
            case "type" -> {
                for (int i = 0; i < items.size(); i++) {
                    t = items.get(i).get(0);
                    if (t.equalsIgnoreCase(ruleValue)) {
                        ctr++;
                    }
                }
                return ctr;
            }
            case "color" -> {
                for (int i = 0; i < items.size(); i++) {
                    t = items.get(i).get(1);
                    if (t.equalsIgnoreCase(ruleValue)) {
                        ctr++;
                    }
                }
                return ctr;
            }
            case "name" -> {
                for (int i = 0; i < items.size(); i++) {
                    t = items.get(i).get(2);
                    if (t.equalsIgnoreCase(ruleValue)) {
                        ctr++;
                    }
                }
                return ctr;
            }
            default -> System.out.println("Enter a valid rule key");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            list.add(new ArrayList<>());
        }
        System.out.println("Enter the list");
        for(int i=0; i<list.size(); i++)
        {
            for(int j=0; j<list.size(); j++)
            {
                list.get(i).add(in.nextLine());
            }
        }
        System.out.println("Enter rule key and rule value");
        String rule_key=in.next();
        String rule_value=in.nextLine();
        System.out.println("Matching rule followed by: "+countMatches(list,rule_key,rule_value));

    }
}
