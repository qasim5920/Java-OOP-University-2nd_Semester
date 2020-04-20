import java.util.Scanner;
public class Array {
    public static void main(String []args) {
        int[] array = new int[7];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seven numbers");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
           int    x=i+1;
            System.out.println(x+" number is "+array[i]);
        }
        int maxNum=array[0];
        for(int i  = 0 ; i < array.length ; i++)
        {

            if(maxNum < array[i]){
                maxNum = array[i];
            }
        }
        System.out.println("Maximum number :" + maxNum );
        int sum=0;
        for(int i = 0 ; i < array.length; i++){

            sum+=array[i];
        }
        int average =  sum/array.length;
        System.out.println(average);
    }
}
