package Task3;

public class HourlyEmployeeTest
{
    public static void main(String[] args)
    {
        //double grossSales, double commissionRate, String firstName, String lastName, String socialSecurityNumber
        // instantiate CommissionEmployee object
        HourlyEmployee employee = new HourlyEmployee(
                25000, 21,"Itachi", "Uchiha", "090078601");


        System.out.println("*****Employee information****");
        System.out.println("First name is"+employee.getFirstName());
        System.out.println( "Last name is"+employee.getLastName());
        System.out.println( "Social security number is"+employee.getSocialSecurityNumber());
        System.out.println("Hourly Wage"+employee.getWage());
        System.out.println( "HOurs worked"+employee.getHours());

        System.out.println(employee.toString()+" Hourly worked: "+employee.getHours()+ " Hourly Wage:"+employee.getWage());
    }
}