public class Student {
   private String name;
   private String email;
   private String cnic;
   private Course course1;
   private Course course2;
    private Address address;

    public Student(String name, String email, String cnic, Course course1, Course course2, Address address) {
        this.name = name;
        this.email = email;
        this.cnic = cnic;
        this.course1 = course1;
        this.course2 = course2;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCnic() {
        return cnic;
    }

    public Course getCourse1() {
        return course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public Address getAddress() {
        return address;
    }
}
