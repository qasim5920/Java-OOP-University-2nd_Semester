package Task3;
import java.util.Scanner;
public class Test {
        public static void main(String []args) {
            Scanner input= new Scanner(System.in);
            Scanner input1= new Scanner(System.in);
            System.out.println("Enter Name:");
            String name=input.nextLine();
            System.out.println("Enter Last name");
            String lastName=input.nextLine();
            System.out.println("Enter gross sales:");
            double grossSales=input1.nextDouble();
            System.out.println("Enter commission rate:");
            double commissionRate=input1.nextDouble();
            System.out.println("Enter base salary:");
            double baseSalary= input1.nextDouble();
            BasePlusCommissionEmployee obj = new BasePlusCommissionEmployee(name,lastName,grossSales,commissionRate,baseSalary);
           System.out.println(obj.toString());
            obj.earning();




    }

}
