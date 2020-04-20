import java.util.Scanner;
import java.lang.Math;
public class MathTest {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
     MathCal M1 = new MathCal();
        System.out.println("Enter 1st num");
     M1.setNum1(input.nextInt());
        System.out.println("Enter 2nd num");
     M1.setNum2(input.nextInt());
     System.out.println(Math.max(M1.getNum1(),M1.getNum2()));
     System.out.println(Math.min(M1.getNum1(),M1.getNum2()));
     System.out.println(Math.pow(M1.getNum1(),M1.getNum2()));
     System.out.println(Math.subtractExact(M1.getNum1(),M1.getNum2()));
     System.out.println(Math.addExact(M1.getNum1(),M1.getNum2()));
    }
}
