import java.util.Scanner;
public class monthly_expense_manager {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of expenditures");
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter expense for Day "+(i+1));
            ar[i]=sc.nextInt();

        }
        int te=0;
        int he=ar[0];
        for(int i=0;i<n;i++)
        {
           te=te+ar[i];
           if(ar[i]>he)
            he=ar[i];
        }
        System.out.println("Total Expenditure: "+te);
        System.out.println("Highest Expenditure:"+he);

        sc.close();
    }
    
}
