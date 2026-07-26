import java.util.Scanner;
public class bmi_health_checker {
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter the height in cm");
          double height=sc.nextDouble();
          System.out.println("Enter the weight");
          double weight=sc.nextDouble(); 
          double height_in_m=height/100.0; 
          double BMI=weight/(height_in_m*height_in_m);
          System.out.printf("BMI:%.2f",BMI);
          System.out.println();
          if(BMI<=18.5)
          {
            System.out.println("Catogory:Underweight");
          }
            else if(BMI<=25)
            {
                System.out.println("Catogory:Normal");
            }
            else if(BMI<=30)
            {
               System.out.println("Catogory:Overweight");
            }
            else
            {
                System.out.println("Catogory:obese");
            }
          }
        }
