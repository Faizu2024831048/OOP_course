import java.util.Scanner;
public class Circle_area {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("radius= ");
        double r=sc.nextDouble();
        double area=Math.PI*Math.pow(r,2);
        System.out.println("area= "+area);
        sc.close();
    }
}
