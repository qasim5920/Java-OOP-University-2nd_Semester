package Task3;

    public class BasePlusCommissionEmployee extends CommissionEmployee{

        private double baseSalary;

        public BasePlusCommissionEmployee(double grossSales, double commissionRate, double baseSalary, String firstName, String lastName, String socialSecurityNumber) {
            super(grossSales, commissionRate,firstName, lastName, socialSecurityNumber);

            this.baseSalary =  baseSalary;

        }

        public double getBaseSalary() {
            return baseSalary;
        }
        public double earnings()
        {
            //  System.out.println(getBaseSalary() );
            return getGrossSales() * getCommissionRate() +  baseSalary;

        }

        public void setBaseSalary(double baseSalary) {
            this.baseSalary = baseSalary;
        }

        public double calculateBonus() {
            //    System.out.println(earnings());
            if(earnings() > 10000 && earnings() <20000){
                return   5000;
            }
            else if(earnings() >= 20000 && earnings() <50000){
                return   10000;
            }
            else if (earnings() > 50000){
                return   20000;

            }
            else{
                return 0;
            }


        }


        public String toString() {
            return super.toString() + ( "base salary= " + baseSalary + ", bonus= " + calculateBonus());
        }

    }

