import java.util.Scanner;
public class MaxNum {
    public static void main(String []args){
        int A;
        int B;
        int C;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        A= input.nextInt();
        System.out.println("Enter 2nd number:");
        B= input.nextInt();
        System.out.println("Enter 3rd number:");
        C= input.nextInt();
        if(A>B||A>C){
            System.out.println("Largest number is "+A);
        }
       else if(B>A||B>C){
            System.out.println("Largest number is :"+B);
        }
       else {
            System.out.println("Largest number is :"+C);
        }
    }
}
