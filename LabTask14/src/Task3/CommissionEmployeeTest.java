package Task3;

public class CommissionEmployeeTest {
 public static void main(String[] args)
    {

        CommissionEmployee employee = new CommissionEmployee(26000, .46,"Qasim", "Tariq", "090078601");

        System.out.println("*****Employee information****");
        System.out.println("First name is"+employee.getFirstName());
        System.out.println( "Last name is"+employee.getLastName());
        System.out.println( "Social security number is"+employee.getSocialSecurityNumber());
        System.out.println("Gross sales is"+employee.getGrossSales());
        System.out.println( "Commission rate is"+employee.getCommissionRate());
        System.out.println("bonus:"+employee.calculateBonus());
        System.out.println(employee.toString());
    }
}
