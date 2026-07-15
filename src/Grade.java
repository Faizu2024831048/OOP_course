import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        String grade;
        if (x >= 90) {
            grade = "A+";
        } else if (x >= 80) {
            grade = "A";
        } else if (x >= 70) {
            grade = "A-";
        } else if (x >= 60) {
            grade = "B";
        } else if (x >= 40) {
            grade = "C+";
        } else {
            grade = "F";
        }
        System.out.print("Grade= " + grade);
        sc.close();
    }
}
