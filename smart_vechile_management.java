import java.util.Scanner;
public class smart_vechile_management 
{
    public static void main(String[] args) 
    {   
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("Smridhi Vechiles Rentiales");
        System.out.print("Enter Customer Name:");
        String c=sc.next();
        System.out.println("1.bike");
        System.out.println("2.car");
        System.out.println("3.SUV");
        System.out.println("4.exit");
        System.out.print("Choose Vechile:");
        int choice=sc.nextInt();
        if(choice == 4) {
           System.out.println("Thank you for using our service!");
             break;
        }   
        System.out.print("Enter Vechile id:");
        int id=sc.nextInt();
        System.out.print("Enter vechile Name:");
        String n=sc.next();
        System.out.print("Enter Vechile Days:");
        int d=sc.nextInt();
        vechile v=null;
        switch(choice)
        {
           case 1:v=new bike(id,n,d);
           break;
           case 2:v=new car(id,n,d);
           break;
           case 3:v=new SUV(id,n,d);
           break;
           default:System.out.println("Invalid choice");
           continue;
        }
        System.out.println("Vechile Details");
        v.display(c);
        v.calculaterent();
        double amount=0;
        if(choice == 1)
        {
            amount=d*300;
        }
        else if(choice==2)
            amount=d*1000;
        else 
            amount=d*1800;
        ((payment)v).makepayment(amount);
        System.out.println("Total Rentials:"+vechile.tr);
    }
    sc.close();
}
}
interface payment
{
    void makepayment(double amount);
}
class vechile
{
    int id;
    String n;
    int d;
    static int tr=0;
    final String company="Smridhi Vechiles Rentials";
   vechile(int id,String n,int d)
   {
     this.id=id;
     this.n=n;
     this.d=d;
     tr++;
   }
   void display(String c)
   {
    System.out.println("Vechile Name:"+n);
    System.out.println("Vechile ID:"+id);
    System.out.println("Rential Days:"+d);
   }
   void calculaterent()
   {
    System.out.println("rent calculation");
   }
}
class bike extends vechile implements payment
{
    bike(int id,String n,int d)
    {
      super(id,n,d);
    }
    void calculaterent()
   {
    System.out.println("Bike rent:"+(d*300));
   }
    public void makepayment(double amount)
    {
       System.out.println("Payment of:"+amount+"succesfully!!");
    }
}
class car extends vechile implements payment
{
   car(int id,String n,int d)
    {
      super(id,n,d);
    }
    void calculaterent()
   {
    System.out.println("car rent:"+(d*1000));
   }
    public void makepayment(double amount)
    {
       System.out.println("Payment of:"+amount+"succesfully!!");
    }
}
class SUV extends vechile implements payment
{ 
    SUV(int id,String n,int d)
    {
      super(id,n,d);
    }
    void calculaterent()
   {
    System.out.println("SUV rent:"+(d*1800));
   }
    public void makepayment(double amount)
    {
       System.out.println("Payment of:"+amount+"succesfully!!");
    }

}
