import java.util.Scanner;
public class MarksPercentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the 5 subjects and the marks obtain in that subject:");
        for(int i=0;i<5;i++)
        {
            String sub=sc.next();
            int x=sc.nextInt();
            if(x>100)
            {
                System.out.println("invalid mark!");
            }
            else
            {
                sum=sum+x;
            }
        }
        int pct=sum/5;
        System.out.println("avaerage marks percentage:"+pct+"%");
        sc.close();
    }
}
