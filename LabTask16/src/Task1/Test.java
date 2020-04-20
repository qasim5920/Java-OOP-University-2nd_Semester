package Task1;
import java.util.Scanner;
public class Test {
    public static void main(String []args){
       Scanner input= new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
       System.out.println("Enter the number of arrays you want");
       int AL=input.nextInt();
        Faculty[] fac= new Faculty[AL];
        for(int i =0;i<fac.length;i++){
            System.out.println("press 1 to Enter values of Permanent Faculty and press 2 to Enter values of Visiting Faculty");
            int choice=input.nextInt();
            if(choice==1){
                System.out.println("Enter id");
                int id = input.nextInt();
                System.out.println("Enter name");
                String name= input2.nextLine();
                System.out.println("Enter salary     ");
                int salary= input.nextInt();
                fac[i]= new PermanentFaculty(id,name,salary);
                //obj.calculateSalary();
            }
            else if(choice==2){
                System.out.println("Enter id");
                int id = input.nextInt();
                System.out.println("Enter name");
                String name= input2.nextLine();
                System.out.println("Enter hours");
                int hours=input.nextInt();
                System.out.println("Enter Salary per hour");
               int salaryPerHour=input.nextInt();
                fac[i]= new VisitingFaculty(id,name,hours,salaryPerHour);
                //obj2.calculateSalary();
            }
            else{
                System.out.println("invalid Entry");
            }
        }
        for(Faculty f:fac)
        {
            f.calculateSalary();
        }
    }
}
