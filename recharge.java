import java.util.Scanner;
public class recharge {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("=====MOBILE RECHARGE CALCULATOR=====");
                System.out.println("1.?199 plan");
                System.out.println("2.?399 plan");
                System.out.println("3.?599 plan");
                System.out.println("4.?899 plan");
                System.out.println("5.exit");
                System.out.println("enter the choice from 1-5");
                int choice=sc.nextInt();
                switch(choice)
                {
                   case 1:System.out.println("Selected plan:?199");
                          System.out.println("Validity:28 days");
                          System.out.println("Data:1.5 GB/Day");
                          System.out.println("Recharge Amount:?199");
                          break;
                   case 2:System.out.println("Selected plan:?399");
                          System.out.println("Validity:60 days");
                          System.out.println("Data:1.5 GB/Day");
                          System.out.println("Recharge Amount:?399");
                         break;
                   case 3:System.out.println("Selected plan:?599");
                          System.out.println("Validity: 75 days");
                          System.out.println("Data:2 GB/Day");
                          System.out.println("Recharge Amount:?599");
                         break;
                   case 4:System.out.println("Selected plan:?899");
                          System.out.println("Validity:100 days");
                          System.out.println("Data:2 GB/Day + unlimited data");
                          System.out.println("Recharge Amount:?899");
                         break;
                   case 5:System.out.println("Thank You!");
                         break;
                    default:
                         System.out.println("Invalid input") ;    
                }
                System.exit(0);

            }
        }
    }
    
}
