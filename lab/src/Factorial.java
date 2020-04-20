import java.util.Scanner;
public class Factorial {
    public static void main(String arg []) {
        Scanner LabWork = new Scanner(System.in);
        int Number,i,result=1;
        System.out.println("Enter a number");
        Number= LabWork.nextInt();
       for(i=1;i<=Number;i++){
           result= result*i;
       }
        System.out.println("Factorial = "+ result);
    }
}
