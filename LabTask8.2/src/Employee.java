public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hiringDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hiringDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hiringDate = hiringDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getHiringDate() {
        return hiringDate;
    }
}
