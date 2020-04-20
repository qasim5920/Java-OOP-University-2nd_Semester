package Task2;
import java.util.Scanner;
public class Test {
    public static void main(String[] ages) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("*****staff Information****");
        System.out.println("Enter staff name:");
        String staffName = input.nextLine();
        System.out.println("Enter staff city:");
        String staffCity = input.nextLine();
        System.out.println("Enter Staff country:");
        String staffCountry = input.nextLine();
        System.out.println("Enter pay:");
        double pay = input2.nextDouble();
        System.out.println("*****Student Information****");
        System.out.println("Enter name");
        String name = input.nextLine();
        System.out.println("Enter city:");
        String city = input.nextLine();
        System.out.println("Enter country:");
        String country = input.nextLine();
        System.out.println("Enter program:");
        String program = input.nextLine();
        System.out.println("Enter Fee:");
        int fee = input2.nextInt();
        System.out.println("Enter year:");
        int year = input2.nextInt();
        Address obj2 = new Address(city, country);
        Address obj3 = new Address(staffCity, staffCountry);
        Student obj = new Student(name, obj2, program, fee, year);
        Staff obj1 = new Staff(staffName, obj3, pay);

        System.out.println("*****Student Information****");
        System.out.println("Name:"+name);
        System.out.println("Address:"+obj2);
        System.out.println("program"+program);
        System.out.println("fee"+fee);
        System.out.println("year"+year);
        System.out.println("*****staff Information****");
        System.out.println("Name:"+staffName);
        System.out.println("Address:"+obj3);
        System.out.println("pay:"+pay);
    }
}