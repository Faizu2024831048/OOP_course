import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.print("Even number.");
        }
        else {
            System.out.print("Odd number.");
        }
        sc.close();
    }
}
