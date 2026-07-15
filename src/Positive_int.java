import java.util.Scanner;
public class Positive_int {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x= sc.nextInt();
        if(x>0)
        {
            System.out.print("positive integer.");
        }
        else
        {
            System.out.print("Not a positive integer.");
        }
        sc.close();
    }
}
