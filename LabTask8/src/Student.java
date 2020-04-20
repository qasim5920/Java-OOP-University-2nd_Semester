public class Student {
    public int id;
    public String name;
    private Course course ;
    Course obj=new Course("EEE 121","ECA");

    public Student(int id, Course course) {
        this.id = id;
        this.course = course;
    }
}
