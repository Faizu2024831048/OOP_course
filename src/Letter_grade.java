import java.util.Scanner;
public class Letter_grade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your grade and if you have completed your semester(yes/no)= ");
        double grade=sc.nextDouble();
        String sem=sc.next();
        if(sem.equalsIgnoreCase("yes"))
        {
            System.out.println("Completed the semester.");
            if(grade>=3.5)
            {
                System.out.println("You have a Letter Grade!");
            }
            else
            {
                System.out.println("Don't have a letter grade.");
            }
        }
        else
        {
            System.out.println("Haven't completed your semester and if you have a letter grade or not will publish after the semester is done");
        }
sc.close();

    }
}
