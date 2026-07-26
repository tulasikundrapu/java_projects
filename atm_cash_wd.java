import java.util.Scanner;
public class atm_cash_wd {
    public static void main(String[]args)
    {
Scanner sc=new Scanner(System.in);
double mb=1000;
System.out.println("Enter the account balance");
double balance=sc.nextDouble();
System.out.println("How much amount do u want to withdarwl");
double wd=sc.nextDouble();
if(wd>0)
{
    if(wd<=balance)
    {
        if((balance-wd)>=mb)
        {
          balance=balance-wd;
          System.out.println("Withdrawl uccessfully");
          System.out.println("Remaining balance: "+balance);
        }
        else
        {
          System.out.println("Withdral failed");
          System.out.println("Mininmum balance is 1000 that must be maintained");
        }
    }
    else
    {
    System.out.println("Insuffiient Balance");
    }
}
else
{
    System.out.println("Invalid withdrawl Amount");
}
sc.close();
    }
    
}
