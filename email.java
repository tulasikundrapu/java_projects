import java.util.Scanner;
public class email
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Email Adress");
        String s=sc.next();
        if((s.endsWith(".in") || s.endsWith(".com") || s.endsWith(".edu") || s.endsWith(".org")|| s.endsWith(".net"))  && (s.contains("@")))
            System.out.println("Valid Email Adress");
        else 
            System.out.println("Invallid Email Adress");
        sc.close();


    }
}