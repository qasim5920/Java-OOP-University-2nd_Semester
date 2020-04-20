package Q2;
import java.util.EnumSet;
public class EnumTest {
    public static void main(String []args){
        System.out.println("Books information:");
        System.out.println("**************************");
        for(Book x: Book.values()){
            System.out.println(x + " " + x.getTitle() +" " +  x.getYear());
        }
        System.out.println("**************************");
        System.out.println("Some books information:");
        System.out.println("**************************");
        for(Book x : EnumSet.range(Book.CHTP, Book.VBHTP)){
            System.out.println(x + " " + x.getTitle() +" " +  x.getYear());
        }
        System.out.println("**************************");
    }

}




