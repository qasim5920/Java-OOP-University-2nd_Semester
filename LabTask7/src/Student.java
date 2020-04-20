import java.util.Scanner;

public class Student {
        public static void main(String []args){
            String id;
           String name;
           int semester;
           double gpa;
           double cgpa;
           int marks;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter id:");
            id= input.nextLine();
            System.out.println("Enter name:");
            name= input.nextLine();
            System.out.println("Enter semester:");
            semester= input.nextInt();
            System.out.println("Enter gpa:");
            gpa= input.nextDouble();
            System.out.println("Enter cgpa:");
            cgpa= input.nextDouble();
            System.out.println("Enter marks in pf:");
            marks= input.nextInt();
            System.out.println(" id:"+id);
            System.out.println(" name:"+name);
            System.out.println(" semester:"+semester);
            System.out.println(" gpa:"+gpa);
            System.out.println(" cgpa:"+cgpa);
            System.out.println("marks in pf:"+marks);
        }
}
