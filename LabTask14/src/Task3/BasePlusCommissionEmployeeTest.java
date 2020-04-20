package Task3;

public class BasePlusCommissionEmployeeTest
{
    public static void main(String[] args)
    {

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(24000, 0.4, 1500, "Naruto", "Uzumaki", "03006141043");

        System.out.println("*****Employee information****");
        System.out.println("First name is:"+employee.getFirstName());
        System.out.println( "Last name is:"+employee.getLastName());
        System.out.println( "Social security number :"+employee.getSocialSecurityNumber());
        System.out.println("Gross sales :"+employee.getGrossSales());
        System.out.println( "Commission rate :"+employee.getCommissionRate());
        System.out.println("Base salary :"+employee.getBaseSalary());


        System.out.println(  employee.toString());
    }
}