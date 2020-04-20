package Task1;

public class Arithmetic {
    public static void main(String []args) {
        int num1, num2;
     try {
            num1 = 0;
            num2 = 62 / num1;
            System.out.println(num2);
            System.out.println("I am Batman");
        }
       catch (ArithmeticException e) { System.out.println("You should not divide a number by zero"); }
   }
}
