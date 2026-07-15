import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 2 numbers and operator: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        char s=sc.next().charAt(0);
        int result = 0;
        if (s== '+') {
            result = a + b;
        } else if (s== '-') {
            result = a - b;
        } else if (s== '*') {
            result = a * b;
        } else if (s== '/') {
            result = a / b;
        }
            System.out.print("result= "+result);
            sc.close();
    }
}
