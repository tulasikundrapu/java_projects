
public class Class {
    public static void main( String[] args)
    {
       grocery o1=new grocery(1,"RICE",50,10,"10-12-2026");
       grocery o2=new grocery(2,"SUGAR",40,5,"15-11-2026");
       grocery o3=new grocery(3,"OIL",120,8,"20-10-2026");
       grocery o4=new grocery(4,"WHEATFLOUR",45,12,"05-01-2026");
       grocery o5=new grocery(5,"SALT",20,15,"30-06-2026");
       double inventory_value=0;
       System.out.println("======Grocery Product Details======");
       o1.display();
       o2.display();
       o3.display();
       o4.display();
       o5.display();
       inventory_value+=o1.inventory();
       inventory_value+=o2.inventory();
       inventory_value+=o3.inventory();
       inventory_value+=o4.inventory();
       inventory_value+=o5.inventory();
       System.out.println("Total Inventory Value= " + inventory_value);
   }
    
}
 class grocery
{
    int pid;
    String name;
    float price;
    int quantity;
    String expirydate;
    grocery(int i,String n,float p,int q,String ed)
    {
        pid=i;
        name=n;
        price=p;
        quantity=q;
        expirydate=ed;
    }
    void display()
    {
        System.out.println("Product Id: "+pid);
        System.out.println("Product name: "+name);
        System.out.println("Product price: "+price);
        System.out.println("Product quantity: "+quantity);
        System.out.println("Product expiry date: "+expirydate );
        System.out.println(" ");
        
    }
    double inventory()
    {
        return price*quantity;
    }
}

