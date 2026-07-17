import java.util.ArrayList;
import java.util.Scanner;
public class Reverse_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter the array(-1 for end the array): ");
        while(true)
        {
            int num= sc.nextInt();
            if(num==-1)
            {
                break;
            }
            arr.add(num);
        }
        System.out.println("Reverse array: ");
        for(int i=arr.size()-1;i>=0;i--)
        {
            System.out.print(arr.get(i)+" ");
        }
        sc.close();
    }
}
