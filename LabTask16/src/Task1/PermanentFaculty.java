package Task1;

public class PermanentFaculty extends Faculty{
    private int salary;

    public PermanentFaculty(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void calculateSalary(){
        System.out.println("id:"+getId());
        System.out.println("name:"+getName());
      System.out.println("Salary:"+salary);
    }
}
