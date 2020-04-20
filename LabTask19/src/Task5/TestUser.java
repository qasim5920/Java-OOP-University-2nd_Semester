package Task5;
import java.util.ArrayList;
import java.util.Scanner;
public class TestUser {
    public static void main(String[] args) {
        ArrayList<User> users= new ArrayList<User>();
        Scanner input= new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
        Scanner input3= new Scanner(System.in);
        System.out.println("Enter ID");
        int id= input.nextInt();
        System.out.println("Enter name");
        String Name= input2.nextLine();
        System.out.println("Enter Status");
        Boolean status = input3.hasNextBoolean();

        /* User user1 = new User(4,"Qasim",true);
        User user3 = new User(43,"Rauf",true);
        User user2 = new User(125,"Umair",false);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        */

        try {
            User user = new User(id, Name, status);
            users.add(user);
            System.out.println(users.get(0));
         throw new UserAccountIsBlockedException("user is blocked");
        }
        catch (UserAlreadyExistException e){
           System.out.println(e.getMessage());
        }

     catch (UserAccountIsBlockedException e){
         System.out.println(e.getMessage());
       }
    }
}