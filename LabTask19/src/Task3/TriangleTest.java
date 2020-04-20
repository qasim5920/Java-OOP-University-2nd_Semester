package Task3;
import java.sql.SQLOutput;
import java.util.Scanner;
public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of first side");
        double side1 = input.nextDouble();
        System.out.println("Enter the value of first side");
        double side2 = input.nextDouble();
        System.out.println("Enter the value of first side");
        double side3 = input.nextDouble();
        try {
            Triangle T = new Triangle(side1, side2, side3);
            System.out.println("Side1: "+side1+"Side2: "+side2+"Side3: "+side3);
            T.toString();
        }
        catch(QasimException e){
            System.out.println(e.getMessage());
        }

    }
}