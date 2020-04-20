public class Student {

    private  String id;
    private    String name;
    private  double CGPA;
    private  static String UniversityName;


    public Student(String id,String name,double CGPA,String UniversityName) {
        this.id=id;
        this.name=name;
        this.CGPA=CGPA;
        this.UniversityName=UniversityName;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void displayInformation()
    {

            System.out.println("Id= "+getId()+" Name="+getName()+" CGPA="+getCGPA()+" University name="+getUniversityName());
            System.out.println(getName()+" is a student of"+getUniversityName());

    }

}
