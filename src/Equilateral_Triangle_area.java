import java.util.Scanner;
public class Equilateral_Triangle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of side(equal): ");
        double arm = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(arm, 2);
        System.out.println("area= " + area);
        sc.close();
    }
}
