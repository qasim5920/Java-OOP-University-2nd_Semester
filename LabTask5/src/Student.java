public class Student {
    private int id;
    private String name;
    private int age;
    private String city;

    public  Student() {
     System.out.println("Constructor with no argument");
    }
    public Student(int id, String name) {
        System.out.println("Constructor with two argument");
        this.id = id;
        this.name = name;
    }


    public Student(int id, String name, int age, String city) {
        System.out.println("Constructor with four argument");
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
