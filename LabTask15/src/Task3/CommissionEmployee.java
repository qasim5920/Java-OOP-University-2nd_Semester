package Task3;

public class CommissionEmployee {
    private String firstName;
     private String LastName;
    private double grossSales ;
    private double commissionRate;
    private double earning;
    public CommissionEmployee(String firstName, String lastName, double grossSales, double commissionRate) {
        this.firstName = firstName;
        LastName = lastName;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    public String toString(){
        return ("CommissionEmployee" + "Name=" + firstName + ",  Last name =" + LastName + ", gross sales=" + grossSales + ", commission rate=" + commissionRate ) ;
    }

    public void earning(){
        if(commissionRate > 0 && commissionRate < 1){
            earning=commissionRate * grossSales;
            System.out.println("Earning:"+earning);

        }
        else{ System.out.println("invalid!:");}

    }


}

