import java.util.Scanner;
public class shop {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        double pa=sc.nextInt();
        int discount=0;
        if(pa<2000)
        {
           discount=5;

        }
        else if(pa>=2000 && pa<5000)
        {
            discount=10;
        }
        else if(pa>5000 && pa<20000)
        {
            discount=15;
        }
        else if(pa>=20000 && pa<=50000)
        {
            discount=30;
        }
        else if(pa>50000 && pa<100000)
        {
            discount=40;
        }
        else if(pa>=100000)
        {
            discount=50;
        }
        double da=(pa*discount)/100;
        double afd=pa-da;
        double gst=(afd*18)/100;
        double fb=afd+gst;
        System.out.println("====BILL DETAILS====");
        System.out.println("Purchase Amount: "+pa);
        System.out.println("Discount: "+discount+"%");
        System.out.println("Discount Amount: "+da);
        System.out.println("Amount after Discount: "+afd);
        System.out.println("GST: "+gst);
        System.out.println("Total Bill: "+fb);
        sc.close();


    }
    
}
