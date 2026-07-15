import java.util.Scanner;
public class Ball_volume {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("radius= ");
        double r=sc.nextDouble();
        double v=(4.0/3.0)* Math.PI* Math.pow(r,3);
        System.out.println("volume= "+v);
        sc.close();
    }
}
