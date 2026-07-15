import java.util.Scanner;
public class Triangle_area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("base= ");
        double b=sc.nextDouble();
        System.out.println("height= ");
        double h=sc.nextDouble();
        double area=0.5*b*h;
        System.out.println("area= "+area);
        sc.close();
    }
}