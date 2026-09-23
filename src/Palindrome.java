import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a text");
        String w= sc.nextLine();
        String r="";
        for(int i=w.length()-1;i>=0;i--)
        {
            r += w.charAt(i);
        }
        if(w.equalsIgnoreCase(r))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
