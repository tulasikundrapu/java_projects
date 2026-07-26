import java.util.Scanner;
public class multiply {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while (true)
         { 
            System.out.println("enter the number");
            int n=sc.nextInt();
            if(n==0)
            {
                break;
            }
            for(int i=1;i<=20;i++)
             {
                 System.out.println(n+" "+"x"+" "+i+" "+"="+n*i);
             }
             System.out.println("enter 0 to exit");

         }
    }
    
}
