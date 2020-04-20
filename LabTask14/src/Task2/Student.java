package Task2;

public class Student extends Person {
    private String program;
    private int fee;
    private int year;

    public Student(String name, Address address, String program, int fee, int year) {
        super(name, address);
        this.program = program;
        this.fee = fee;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public int getFee() {
        return fee;
    }

    public int getYear() {
        return year;
    }
}
