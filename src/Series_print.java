import java.util.Scanner;
public class Series_print {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        for(int i=2;i<=20;i+=2)
        {
            System.out.print(i+"  ");
            s=s+i;
        }
        System.out.println();
        int x=2;
        while(x<=20)
        {
            System.out.print(x+"  ");
            x+=2;
        }
        int y=2;
        System.out.println();
        do{
            System.out.print(y+"  ");
            y+=2;
        }while(y<=20);
        System.out.println();
        System.out.println("sum= "+s);

        sc.close();
    }
}
