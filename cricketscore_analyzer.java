import java.util.Scanner;
public class cricketscore_analyzer {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of players");
        int n=sc.nextInt();
        System.out.println("Enter the score of players");
        int ar[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the score of player"+(i+1));
            ar[i]=sc.nextInt();
        }
        int h=ar[0];
        int l=ar[0];
        for(int i=0;i<n;i++)
        {
            sum=sum+ar[i];
            if(ar[i]>h)
            {
                h=ar[i];
            }
            if(ar[i]<l)
            {
                l=ar[i];
            }

        }
        double avg=sum/n;
        System.out.println("Highest Score:"+h);
        System.out.println("Lowest Score: "+l);
        System.out.printf("Average Score:%.2f",avg);
        sc.close();
    }
}
