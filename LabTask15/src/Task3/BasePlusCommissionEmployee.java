package Task3;

public class BasePlusCommissionEmployee extends CommissionEmployee {
   private double baseSalary;
   private double earning;
    public BasePlusCommissionEmployee(String firstName, String lastName, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public void earning(){
        if(baseSalary > 500){
           earning = getCommissionRate()*getGrossSales()*baseSalary;
            System.out.println("Earning:"+earning);
        }
        else {
            System.out.println("Base salary less than 500");
        }
    }

    public String toString() {
        return ("CommissionEmployee" + "Name= " + getFirstName() + ",  Last name = " + getLastName() + ", gross sales= " + getGrossSales() + ", commission rate= " + getCommissionRate() +"baseSalary= " + baseSalary );
    }
}
