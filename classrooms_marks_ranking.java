import java.util.Scanner;
public class classrooms_marks_ranking {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of students");
            int n=sc.nextInt();
            int ar[]=new int [n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter the marks of the student"+(i+1));
               ar[i]=sc.nextInt();

            }
            int sum=0;
            int h=ar[0];
            for(int i=0;i<n;i++)
            {
               sum=sum+ar[i];
               if(ar[i]>h)
                h=ar[i];
            }
            double avg=sum/n;
            System.out.println("Topper marks:"+h);
            System.out.printf("Average marks:%.2f",avg);
        }
    }
    
}
