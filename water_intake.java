import java.util.Scanner;
public class water_intake {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter water intake for Monday(litres)");
        double m=sc.nextDouble();
        System.out.println("Enter water intake for Tuesday(litres)");
        double t=sc.nextDouble();
        System.out.println("Enter water intake for Wednesday(litres)");
        double w=sc.nextDouble();
        System.out.println("Enter water intake for Thrusday(litres)");
        double thrus=sc.nextDouble();
        System.out.println("Enter water intake for Friday(litres)");
        double f=sc.nextDouble();
        System.out.println("Enter water intake for Saturday(litres)");
        double sat=sc.nextDouble();
        System.out.println("Enter water intake for Sunday(litres)");
        double sun=sc.nextDouble();
        double twi=m+t+w+thrus+f+sat+sun;
        double avgtwi=twi/7;
        System.out.printf("Total water Intake:%.2f",twi);
        System.out.println();
        System.out.printf("Average Water Intake:%.2f",avgtwi);
        System.out.println();
        sc.close();
    
    }
}
