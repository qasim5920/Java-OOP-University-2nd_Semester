package Assignment3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        int i = -1;
        User user = new User();
        Scanner input = new Scanner(System.in);
        DbUserService dbUserService = new DbUserService();

        while (i != 0) {
            menu();

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            if (i == 1) {

                System.out.print("Enter user id: ");
                user.setName(input.nextInt());

                System.out.print("Enter user name: ");
                user.setName(input.nextLine());

                System.out.print("Enter user gender: ");
                user.setGender(input.nextLine());

                System.out.print("Enter user phone: ");
                user.setPhone(input.nextLine());

                System.out.print("Enter user status (true or false): ");
                user.setStatus(input.nextBoolean());

                dbUserService.addUser(user);
            }

            if (i == 2) {
                System.out.print("Enter user id which you want update: ");
                user.setId(input.nextInt());
                input.nextLine();

                System.out.print("Enter user name: ");
                user.setName(input.nextLine());

                System.out.print("Enter user gender: ");
                user.setGender(input.nextLine());

                System.out.print("Enter user phone: ");
                user.setPhone(input.nextLine());

                System.out.print("Enter user status (true or false): ");
                user.setStatus(input.nextBoolean());

                dbUserService.updateUser(user);
            }

            if (i == 3){
                System.out.print("Enter user id: ");
            dbUserService.deleteUser(input.nextInt());
        }

               if(i==4) {
                   try {
                       System.out.print("Enter user id: ");
                       User u = dbUserService.getUser(input.nextInt());

                       System.out.printf(
                               "(%d, %s, %s, %s, %s)\n",
                               u.getId(),
                               u.getName(),
                               u.getGender(),
                               u.getPhone(),
                               u.getStatus()
                       );
                   } catch (NullPointerException e) {
                       System.out.println("User does not found in database.");
                   }
               }

                if (i== 5) {
                    System.out.print("Enter user id: ");
                    dbUserService.unblockUser(input.nextInt());
                }

                if(i==6) {
                    System.out.print("Enter user id: ");
                    dbUserService.blockUser(input.nextInt());
                }

                if(i==7) {
                    ResultSet users = dbUserService.getAllUsers();
                    while (users.next()) {
                        System.out.printf("(%d, %s, %s, %s, %s)\n",
                                users.getInt("id"),
                                users.getString("name"),
                                users.getString("gender"),
                                users.getString("phone"),
                                users.getBoolean("status")
                        );
                    }
                }
            }
        }
    }

    public static void menu() {
        System.out.println("Select appropriate option: ");
        System.out.println("1: Add User");
        System.out.println("2: Update User");
        System.out.println("3: Delete User");
        System.out.println("4: Get User");
        System.out.println("5: Unblock User");
        System.out.println("6:Block User");
        System.out.println("7: All Users");
        System.out.println("0: Exit");
    }
}
