import java.util.Scanner;
public class C_to_F {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("celsius temperature: ");
        double c= sc.nextDouble();
        double f=c*(9.0/5.0)+32;
        System.out.println("fahrenheit temperature: "+f);
        sc.close();
    }
}
