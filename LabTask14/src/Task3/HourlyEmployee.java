package Task3;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    private double earning;

    public HourlyEmployee(double wage, double hours, String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage >= 0){
            this.wage = wage;
        }
        else{
            this.wage =  wage*(-1);
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours > 0 && hours < 200){
            this.hours = hours;

        }
        else if(hours  <  0)
        {
            this.hours =   0;
        }
        else {
            this.hours =  200;
        }
        this.hours = hours;
    }

    public void earnings(){
      earning= 1.5  * hours * wage;
      System.out.println("Earning: "+earning);
    }


}