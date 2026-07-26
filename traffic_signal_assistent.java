import java.util.Scanner;
public class traffic_signal_assistent {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while (choice<4)
        {
        System.out.println("enter the traffic signal colour");
        System.out.println("1.Red");
        System.out.println("2.Green");
        System.out.println("3.Yellow");
        choice=sc.nextInt();
        switch(choice)
        {
          case 1-> System.out.println("Action:Stop");
          case 2-> System.out.println("Action:Go");
          case 3-> System.out.println("Action:Ready");
          case 4-> System.out.println("Invalid traffic signal colour");
        }
    }
        System.exit(0);
    
}
    
}
