import java.util.Scanner;
public class Greatest_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        int x=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(x<=arr[i])
            {
                x=arr[i];
            }
        }
        System.out.println("Greatest number is: "+x);
        sc.close();
    }
}
