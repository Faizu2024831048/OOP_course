import java.util.Scanner;
public class Char_Occurrence {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("print the text:");
        String txt=sc.nextLine();
        System.out.println("print the target character:");
        char w= sc.next().charAt(0);
        int cnt=0;
        for(int i=0;i<txt.length();i++)
        {
            if(w==txt.charAt(i))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
