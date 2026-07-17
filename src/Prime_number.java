import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x= sc.nextInt();
        int cnt=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                cnt++;
            }
        }
        if(cnt>2)
        {
            System.out.print("It's not a prime number.");
        }
        else
        {
            System.out.print("It's a prime number!");
        }
        sc.close();
    }
}
