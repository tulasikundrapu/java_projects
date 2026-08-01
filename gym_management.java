public class gym_management
{
        public static void main(String[] args)
    {
        sample o1=new sample(101,"Raghu","Gold",12);
        sample o2=new sample(102,"Arvind","Silver",4);
        sample o3=new sample(103,"Santosh","Gold",6);
        System.out.println("GYM MEMBERSHIP DETAILS");
        o1.display();
        System.out.println("----------------------------");
        o2.display();
        System.out.println("----------------------------");
        o3.display();
        System.out.println("----------------------------");


    }
}
class sample
{
    int mi;
    String mn;
    String mt;
    int d;
    sample(int mi,String mn,String mt,int d)
    {
        this.mi=mi;
        this.mn=mn;
        this.mt=mt;
        this.d=d;
    }
    void display()
    {
        System.out.println("Member ID: "+mi);
        System.out.println("Member Nmae:"+mn);
        System.out.println("Membership type:"+mt);
        System.out.println("Duration:"+d+"months");
    }
}
