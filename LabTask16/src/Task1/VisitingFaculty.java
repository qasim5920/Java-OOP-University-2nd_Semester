package Task1;

public class VisitingFaculty extends Faculty {
    private int hours;
    private int salaryPerHour;
    private int salary;
    public VisitingFaculty(int id, String name, int hours, int salaryPerHour) {
        super(id, name);
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }

    public int getHours() {
        return hours;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }
    public void calculateSalary(){
      salary=hours*salaryPerHour;
        System.out.println("id:"+getId());
        System.out.println("name:"+getName());
        System.out.println("hours worked:"+getHours());
        System.out.println("salary per hour:"+getSalaryPerHour());
      System.out.println("Total Salary:"+salary);
    }
}
