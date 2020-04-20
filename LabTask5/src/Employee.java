public class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee() {
        this(10,"Qasim");
    }

    public Employee(int id, String name) {
        this(10,"Qasim",5400);
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
