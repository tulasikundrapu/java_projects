import java.util.Scanner;
public class restraunt_bill
{
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("*****RESTAURANT BILLING SYSTEM*****");
            System.out.println("Enter Customer Name:");
            String cn=sc.next();
            System.out.println("Enter Food item:");
            String fi=sc.next();
            System.out.println("Enter Quantity:");
            int n=sc.nextInt();
            System.out.println("Enter price per item:");
            double ppi=sc.nextDouble();
            System.out.println("Select Order type");
            System.out.println("1.Dine-IN");
            System.out.println("2.Takeaway");
            System.out.println("3.Home  Delivery");
            int choice =sc.nextInt();
            double fc=ppi*n;
            double gst=(fc*5)/100;
            int dc;
            if(fc<500)
            {
               dc=50; 
            }
            else{
                dc=0;
            }
            switch(choice)
            {
                case 1 : double tb=gst+fc;
                        System.out.println("BILL");
                         System.out.println("Customer Name:"+cn);
                         System.out.println("Food item:"+fi);
                         System.out.println("Quantity:"+n);
                         System.out.println("Food cost:"+fc);
                         System.out.println("GST(5%):"+gst);
                         System.out.println("Total bill:"+tb);
                         System.out.println("Thank You! Visit Again");

                          break;
                case 2: int pc=20;
                        double t=gst+fc+pc;
                        System.out.println("BILL");
                        System.out.println("Customer Name:"+cn);
                        System.out.println("Food item:"+fi);
                        System.out.println("Quantity:"+n);
                        System.out.println("Food cost:"+fc);
                        System.out.println("Total bill:"+t);
                        System.out.println("Thank You! Visit Again");

                        
                        break;
                case 3: double tbi=gst+fc+dc;
                        System.out.println("BILL");
                        System.out.println("Customer Name:"+cn);
                        System.out.println("Food item:"+fi);
                        System.out.println("Quantity:"+n);
                        System.out.println("Food cost:"+fc);
                        System.out.println("Delivery charges:"+dc);
                        System.out.println("GST(5%):"+gst);
                        System.out.println("Total bill:"+tbi);
                        System.out.println("Thank You! Visit Again");
                        break;
            }
           
  
           
        }
}

 