package Sp19_bse_004;

import java.sql.*;
import static Sp19_bse_004.Gender.Female;
import static Sp19_bse_004.Gender.Male;


    public class EmployeeTest {
        public static void main(String[] args) {


            Employee employee1 = new Employee("Ali", 100, Male, "permanent");
            Employee employee2 = new Employee("Tooba", 125, Female, "visiting");
            Employee employee3 = new Employee("Ahmed", 230, Male, "contractBased");
            Employee employee4 = new Employee("Qasim", 1, Male, "CEO");
            Employee employee5 = new Employee("Hamza", 9, Male, "visiting");

            addEmployee(employee1);
            addEmployee(employee2);
            addEmployee(employee3);
            addEmployee(employee4);
            addEmployee(employee5);
            displayEmployee();
          updateEmployee(employee1);
           deleteEmployee(employee4);
        }
        public static  void addEmployee(Employee employee){
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost/ems", "root", "Titan1999");
                statement = connection.createStatement();
                statement.executeUpdate(String.format("INSERT INTO employees (id, name, gender, type) VALUES (%d, '%s' , %d, '%s')",
                        employee.getId(), employee.getName(), employee.getGender() == Gender.Male?1:0, employee.getType()));

            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        public static  void displayEmployee(){
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost/ems", "root", "Titan1999");
                statement = connection.createStatement();
                resultSet =  statement.executeQuery("SELECT * FROM employees");

                while(resultSet.next()){
                    System.out.println(resultSet.getInt("id"));
                    System.out.println(resultSet.getInt("gender") == 1?"Male":"Female");
                    System.out.println(resultSet.getString("name"));
                    System.out.println(resultSet.getString("type"));
                }
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        public static  void updateEmployee(Employee employee){
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost/ems", "root", "Titan1999");
                statement = connection.createStatement();
                statement.executeUpdate("UPDATE employees SET   name='Qasim' WHERE id =1 ");
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        public static  void deleteEmployee(Employee employee){
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost/ems", "root", "Titan1999");
                statement = connection.createStatement();
                statement.executeUpdate(String.format("DELETE FROM employees WHERE id ="+employee.getId()));
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }


    }