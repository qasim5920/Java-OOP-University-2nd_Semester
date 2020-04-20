import java.util.Scanner;
public class EmployeeTest {


    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String gender;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter name");
        String name=input.nextLine();
        System.out.println("Enter id");
        int id=input.nextInt();
        System.out.println("Enter Salary");
        int basicSalary=input.nextInt();
        System.out.println("Enter Gender)");
        gender=scanner.nextLine();
        Gender g=Gender.valueOf(gender);
        Employee obj = new Employee(name, id, basicSalary,g);
        obj.calculateBonus();}

}


