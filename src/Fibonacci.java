import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of digits of the fibonacci series: ");
        int x=sc.nextInt();
    int[] arr=new int[x];
    arr[0]=0;
    arr[1]=1;
    for(int i=2;i<x;i++)
    {
        arr[i]=arr[i-1]+arr[i-2];
    }
    for(int j=0;j<x;j++)
    {
        System.out.print(arr[j]+" ");
    }
    sc.close();
    }
}
