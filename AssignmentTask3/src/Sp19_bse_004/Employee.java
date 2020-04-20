package Sp19_bse_004;

public class Employee {
    private String Name;
    private int id;
    private Gender gender;
    private String type;

    public Employee(String Name, int id, Gender gender, String type) {
        this.Name = Name;
        this.id = id;
        this.gender = gender;
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                ", tupe='" + type + '\'' +
                '}';
    }
}

