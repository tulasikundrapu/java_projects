import java.util.Scanner;
public class primenumber_identifier {
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number");
            int n=sc.nextInt();
            int found=0;
            if(n<=1)
                found=1;
            else
            {
            for(int i=2;i<=n/2;i++)
            {
              if(n%i==0)
              {
                found=1;
                break;
              }
            }
            }
            if(found==0)
                System.out.println("Given number is a prime number");
            else
                System.out.println("Given number is not a prime nuber");
        }
    }
    
