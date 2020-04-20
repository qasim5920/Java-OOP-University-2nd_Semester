package Task3;
public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(double grossSales, double commissionRate, String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }


    public void setGrossSales(double grossSales){
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    public double getGrossSales()
    {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate)
    {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    public double getCommissionRate()
    {
        return commissionRate;
    }

    public double earnings()
    {
        return getCommissionRate() * getGrossSales() ;
    }


    public double calculateBonus() {
        if(earnings()> 10000 && earnings() <20000){
          return  5000;
        }
        else if(earnings() >= 20000 && earnings() <50000){
            return 10000;
        }
        else if (earnings() > 50000){
            return 20000;

        }
        else{
            return 0;
        }


    }


    public String toString() {
        return super.toString() + ( "grossSales= " + grossSales + ", commissionRate= " + commissionRate);
    }
}