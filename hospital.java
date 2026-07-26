
public class hospital
{
public static void main(String[] args)
{
System.out.println("===HOSTEL ROOM DETAILS===");
rooms o1=new rooms(101,4,3,8000);
rooms o2=new rooms(102,4,4,8000);
rooms o3=new rooms(103,4,1,8000);
o1.display();
o2.display();
o3.display();
}
}
class rooms
{
int roomno;
int capacity;
int obeds;
double rent;
rooms(int rn,int c,int ob,double r)
{
roomno=rn;
capacity=c;
obeds=ob;
rent=r;
}
void display()
{
System.out.println("Room No: "+roomno);
System.out.println("Capacity: "+capacity);
System.out.println("Ocupied beds: "+obeds);
int available=capacity-obeds;
System.out.println("Available beds: "+available);
System.out.println("Room rent: "+rent);
if(available==0)
{
System.out.println("Status:Full");
}
else
{
System.out.println("Status:Available ");
}
System.out.println("-------------------");
}
}





