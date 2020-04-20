import java.util.Scanner;
public class StudentTest {
    public static void main(String[]args){
     Scanner input = new Scanner(System.in);
     //Course
        System.out.println("Enter Course code:");
         String courseCode= input.nextLine();
        System.out.println("Enter course Title :");
         String courseTitle=input.nextLine();
        System.out.println("Enter course code:");
        String courseCode2= input.nextLine();
        System.out.println("Enter course Title ");
        String courseTitle2=input.nextLine();
      //PhoneNumber
        System.out.println("Enter country code:");
         int countryCode=input.nextInt();
        System.out.println("Enter City code:");
         int cityCode=input.nextInt();
        System.out.println("Enter line number:");
         int lineNumber=input.nextInt();
        PhoneNumber PN1 = new PhoneNumber(countryCode,cityCode,lineNumber);

        //Address
        System.out.println("Please tell me how many addresses you have");
        int addressLength = input.nextInt();
        Address [] address1 = new Address[addressLength];

        for(int i  =0 ; i < addressLength; i++) {
            System.out.println("Enter Street Address:");
            int streetAddress = input.nextInt();
            System.out.println("Enter Town name:");
            String town = input.nextLine();
            System.out.println("Enter City name:");
            String city = input.nextLine();
            System.out.println("Enter Country name:");
            String country = input.nextLine();
            Address  A1= new Address(streetAddress,town,city,country,PN1);
        }
     //Student
        System.out.println("Enter Name:");
        String name=input.nextLine();
        System.out.println("Enter Email:");
        String email=input.nextLine();
        System.out.println("Enter CNIC:");
        String cnic=input.nextLine();


     Course C1 = new Course(courseCode,courseTitle);
     Course C2= new Course(courseCode2,courseTitle2);
     Student S1=new Student(name,email,cnic,C1,C2,address1[input.nextInt()]);
     // For first student
     System.out.println("name:"+S1.getName());
     System.out.println("Email:"+S1.getEmail());
     System.out.println("CNIC:"+S1.getCnic());
     System.out.println("Course Code:"+S1.getCourse1().getCourseCode()+"Course Title"+S1.getCourse1().getCourseTitle());
     System.out.println("Course Code:"+S1.getCourse2().getCourseCode()+"Course Title"+S1.getCourse2().getCourseTitle());

     // for second Student
        Course C3 = new Course("HUM 100","Geology");
        Course C4= new Course("EEE 246","DLD");
        Student S2=new Student("Rauf","Rauf123@gmail.com","36564-4444555-7",C3,C4,address1[input.nextInt()]);
        System.out.println("name:"+S2.getName());
        System.out.println("Email:"+S2.getEmail());
        System.out.println("CNIC:"+S2.getCnic());
        System.out.println("Course Code:"+S2.getCourse1().getCourseCode()+"Course Title"+S2.getCourse1().getCourseTitle());
        System.out.println("Course Code:"+S2.getCourse2().getCourseCode()+"Course Title"+S2.getCourse2().getCourseTitle());
        for(int i  =0 ; i < addressLength; i++) {
            System.out.println("Enter Street Address:");
            int streetAddress = input.nextInt();
            System.out.println("Enter Town name:");
            String town = input.nextLine();
            System.out.println("Enter City name:");
            String city = input.nextLine();
            System.out.println("Enter Country name:");
            String country = input.nextLine();
        }


    }
}
