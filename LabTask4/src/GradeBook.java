public class GradeBook {
    private String instructorName="Ali";
    private String courseTitle="Math";

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public void displayGradeBookInfo(){
     System.out.println("Instructor name ="+instructorName);
        System.out.println("course title ="+courseTitle);
  }
}
