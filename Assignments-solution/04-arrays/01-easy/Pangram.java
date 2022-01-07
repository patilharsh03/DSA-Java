import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence without any space: ");
        String s = in.next();
        System.out.println("Is it a pangram sentence: " + checkIfPangram(s));    
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i)- 97] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == false) {
                return false;
            }
        }
        return true;
    }

}
