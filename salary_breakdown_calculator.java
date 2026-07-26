import java.util.Scanner;
public class salary_breakdown_calculator {
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter basic Salary");
            double bs=sc.nextDouble();
            System.out.println("Enter HRA");
            double HRA=sc.nextDouble();
            System.out.println("Enter DA");
            double DA=sc.nextDouble();
            System.out.println("Enter TA");
            double TA=sc.nextDouble();
            System.out.println("Enter MA");
            double MA=sc.nextDouble();
            System.out.println("Enter Special Allowances");
            double SA=sc.nextDouble();
            System.out.println("Bonus");
            double B=sc.nextDouble();
            System.out.println("Other Allowances");
            double OA=sc.nextDouble();
            double gs=bs+HRA+DA+TA+MA+SA+B+OA;
            System.out.println("Gross Slar:"+gs);
            System.out.println("Provient Fund");
            double PF=sc.nextDouble();
            System.out.println("Proffessional Tax");
            double PT=sc.nextDouble();
            System.out.println("Income Tax");
            double IT=sc.nextDouble();
            System.out.println("Insurance");
            double I=sc.nextDouble();
            System.out.println("Loan Deduction");
            double LD=sc.nextDouble();
            double td=PF+PT+I+IT+LD;
            System.out.println("Total Deducion:"+td);
            double ns=gs-td;
            System.out.println("Net Salary:"+ns);
        sc.close();
    }
    
}
