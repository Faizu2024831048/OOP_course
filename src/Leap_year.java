import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int x=sc.nextInt();
        if(x%400==0 || (x%4==0 && x%100!=0))
        {
            System.out.print("Leap Year");
        }
        else
        {
            System.out.print("Not A Leap Year");
        }
        sc.close();
    }
}
