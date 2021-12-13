import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter marks out of 100: ");
        int marks = in.nextInt();
        System.out.println("Grade = " + grade(marks));
    }

    static String grade(int marks) {
        String grade;
        if (marks > 90) {
            grade = "AA";
        } else if (marks > 80) {
            grade = "AB";
        } else if (marks > 70) {
            grade = "BB";
        } else if (marks > 60) {
            grade = "BC";
        } else if (marks > 50) {
            grade = "CD";
        } else if (marks > 40) {
            grade = "DD";
        } else {
            grade = "Fail";
        }
        return grade;
    }
}
