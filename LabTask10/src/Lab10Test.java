import lab.mybio.Bio;
import java.util.Scanner;
public class Lab10Test {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        Bio B1 = new Bio();
        System.out.println("Enter name");
        B1.setName(input.nextLine());
        System.out.println("Enter Last Name");
        B1.setLastName(input.nextLine());
        System.out.println("Enter Age");
        B1.setAge(input.nextInt());
        System.out.println("Enter Email");
        B1.setEmail(input.nextLine());
        System.out.println(B1.getName());
        System.out.println(B1.getLastName());
        System.out.println(B1.getAge());
        System.out.println(B1.getEmail());



    }
}
