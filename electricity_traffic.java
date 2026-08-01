public class electricity_traffic 
{
   public static void main(String[] args)
   {
     residential_consumer o1=new residential_consumer(101,"Tulasi",250);
     commercial_consumer o2= new commercial_consumer(102,"Siri",250);
     industrial_consumer o3=new industrial_consumer(103,"Nikitha",250);
     System.out.println("Residential Consumer");
     System.out.println("--------------------");
     o1.display();
     o1.amount();
     System.out.println("Commercial Consumer");
     System.out.println("-------------------");
     o2.display();
     o2.amount();
     System.out.println("Industrial Consumer");
     System.out.println("-------------------");
     o3.display();
     o3.amount();
   } 
}
class consumer
{
   int id;
   String n;
   int c;
   consumer(int id,String n,int c)
   {
    this.id=id;
    this.n=n;
    this.c=c;
   }
   void display()
   {
    System.out.println("Customer ID: "+id);
    System.out.println("Customer Name:"+n);
    System.out.println("Units Consumed:"+c);
   }
   void amount()
   {
    System.out.println("Bill Amount:"+0);
   }
}
class residential_consumer extends consumer
{
    int u=6;
  residential_consumer(int id,String n,int c)
  {
    super(id,n,c);
  }
  void amount()
  {
     System.out.println("Bill Amount:"+(u*c));
  }
}
class commercial_consumer extends consumer
{
    int u=10;
  commercial_consumer(int id,String n,int c)
  {
    super(id,n,c);
  }
  void amount()
  {
    System.out.println("Bill Amount:"+(u*c));
  }
}
class industrial_consumer extends consumer
{
    int u=15;
   industrial_consumer(int id,String n,int c)
   {
    super(id,n,c);
   }
   void amount()
   {
    System.out.println("Bill Amount:"+(u*c));
   }
}
