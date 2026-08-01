public class transport_fare_management
{
    public static void main(String[] args)
    {
       bus o1=new bus(101,"Rahul");
       train o2=new train(102,"Sidhu");
       metro o3=new metro(103,"Rishi");
       o1.display();
       o1.calculate();
       System.out.println("");
       o2.display();
       o2.calculate();
       System.out.println("");
       o3.display();
       o3.calculate();
       
    }
}
class passenger
{
    int id;
    String n;
    passenger(int id,String n)
    {
       this.id=id;
       this.n=n;
    }
    void display()
    {
        System.out.println("Passenger Name: "+n);
        System.out.println("Passenger ID: "+id);
    }
    void calculate()
    {
        System.out.println("Fare");
    }
}
class bus extends passenger
{ 
    bus(int id,String n)
    {
      super(id,n);
    }
    void calculate()
    {
        System.out.println("Bus Fare:50/-");
    }
}
class train extends passenger
{
   train(int id,String n)
   {
    super(id,n);
   }
   void calculate()
    {
        System.out.println("Train Fare:100/-");
        
    }
}
class metro extends passenger
{
   metro(int id,String n)
   {
    super(id,n);
   }
   void calculate()
    {
        System.out.println("Metro Fare:200/-");
        
    }
}
