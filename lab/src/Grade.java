    import java.util.Scanner;
    public class Grade {
        public static void main(String arg []) {
            Scanner LabWork = new Scanner(System.in);
            int marks;
            System.out.print("Enter your marks = ");
            marks= LabWork.nextInt();
            if(marks>90 ){
                System.out.println("Grade=A+");
            }
            else if(marks>80 && marks<=90){
                System.out.println("Grade=A");
            }
            else if(marks>70 && marks<=80){
                System.out.println("Grade=B");
            }
            else if(marks>60 && marks<=70){
                System.out.println("Grade=C");
            }
            else if(marks>50 && marks<=60){
                System.out.println("Grade=D");
            }
            else{
                System.out.println("Grade=F");
            }

        }
    }

