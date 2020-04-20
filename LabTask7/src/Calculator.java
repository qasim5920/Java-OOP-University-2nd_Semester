import  java.util.Scanner;
public class Calculator {
    public static void main(String []args){
        int A;
        int B;
        int C;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        A= input.nextInt();
        System.out.println("Enter Second number:");
        B= input.nextInt();
        C=A+B;
        System.out.println("1st number + 2nd number="+C);
        C=A-B;
        System.out.println("1st number - 2nd number="+C);
        C=A*B;
        System.out.println("1st number * 2nd number="+C);
        C=A/B;
        System.out.println("1st number / 2nd number="+C);
    }


}
