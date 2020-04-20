import java.util.Scanner;
public class EmployeeTest{
    public static  void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Address obj1= new Address("Sialkot",123,"Pakistan");
        Employee E1 = new Employee(004,obj1);
        System.out.println("Please Enter your first name:");
        E1.setEmployeeName(input.nextLine());
        System.out.println("Employee1 name:"+E1.getEmployeeName());
        System.out.println("Employee1 Address:"+" Employee1 Country: "+E1.getEmployeeAddress().getCountry()+" Employee1 City: "+E1.getEmployeeAddress().getCity()+" Employee1 Street number: "+E1.getEmployeeAddress().getStreetNumber());
        System.out.println("Employee2 id:"+E1.getEmployeeID());
        System.out.println(" Employee2 Address:"+" Country: "+E1.getEmployeeAddress().getCountry()+" City: "+E1.getEmployeeAddress().getCity()+" Street number: "+E1.getEmployeeAddress().getStreetNumber());

    }
}

