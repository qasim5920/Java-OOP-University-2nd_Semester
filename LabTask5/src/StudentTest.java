public class StudentTest {
    public static void main(String []args){
        Student obj2=new Student();
      Student obj1=new Student(004,"Qasim",19,"Sialkot");
      System.out.println("Name:"+obj1.getName());
        System.out.println("ID:"+obj1.getId());
        System.out.println("Age:"+obj1.getAge());
        System.out.println("City:"+obj1.getCity());
        Student obj3=new Student(1,"rauf");
        System.out.println("Name:"+obj3.getName());
        System.out.println("ID:"+obj3.getId());

    }
}
