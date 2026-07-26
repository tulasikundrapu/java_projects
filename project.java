public class project
{
public static void main(String[] args)
{
child o=new child(101,"sunitha","biology","Teaching ");
child o2=new child(102,"shankar","accounts","non teaching");
o.display();
o2.show();
}
}
class base
{
int ei;
String name;
String subject;
String response;
base(int i,String n,String s,String r)
{
ei=i;
name=n;
subject=s;
response=r;
}
void display()
{
System.out.println("TEACHING STAFF DETAILS");
System.out.println("Employee id: "+ei);
System.out.println("Employee Nmame: "+name);
System.out.println("Teaching subject: "+subject);
System.out.println("Responsibility: "+response);
System.out.println();
}
}
class child extends base
{
child(int i,String n,String s,String r)
{
super(i,n,s,r);
}
void show()
{
System.out.println("NON TEACHING STAFF DETAILS");
System.out.println("Employee id: "+ei);
System.out.println("Employee Name: "+name);
System.out.println("Department: "+subject);
System.out.println("Responsibility: "+response);
}
}
