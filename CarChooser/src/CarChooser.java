import java.util.Random;
public class CarChooser {
    public static void main(String[]args) {
        Random rand = new Random();
        int car = rand.nextInt(3);
        if (car == 1) { System.out.println("lamborghini centenario");}
        else if (car == 2) { System.out.println("mclaren p1");}
        else if (car == 3) { System.out.println("bugatti divo"); }
            }
        }