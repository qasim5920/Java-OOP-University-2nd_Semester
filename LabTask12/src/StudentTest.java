import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
    public static void main(String[]args) {
       ArrayList<String> Student = new ArrayList<String>();
         Student.add("Ahmed");
         Student.add("Ali");
        Student.add("Umer");
        Student.add("Talha");
        System.out.println(Student);
        Student.add("Waleed");
        Student.add("Tooba");
        System.out.println(Student);
        System.out.println("List size:"+Student.size());
        Student.add("Rizwan");
        Student.add("Hamza");
        Collections.sort(Student,Collections.reverseOrder());
        System.out.println(Student);
       Student.remove("Tooba");
        System.out.println(Student);
        Student.remove(Student.size()-1);
        System.out.println(Student);
        System.out.println("Second Student: "+Student.get(1));
         Student.set(0,"Muhammad Waleed ");
        System.out.println(Student);
        Student.remove(0);
        System.out.println(Student);
        Student.clear();
        System.out.println(Student);
    }
}
