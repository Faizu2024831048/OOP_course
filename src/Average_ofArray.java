import java.util.Scanner;
public class Average_ofArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size and numbers: ");
        int n= sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]= sc.nextInt();
           sum=sum+arr[i];
        }
        System.out.print("Sum of all the number is: "+sum);
        sc.close();
    }
}
