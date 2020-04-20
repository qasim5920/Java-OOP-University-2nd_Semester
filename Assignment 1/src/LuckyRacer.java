import java.util.Scanner;
import java.util.Random;
public class LuckyRacer {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        AutomaticCar car1 = new AutomaticCar();
        AutomaticCar car2 = new AutomaticCar();
        AutomaticCar car3 = new AutomaticCar();
        AutomaticCar car4 = new AutomaticCar();
        AutomaticCar car5 = new AutomaticCar();

        car1.setYear(9000);
        System.out.println("Race Year:   " + car1.getYear());

        System.out.println("1st Car is=");
        String M1 = scan.nextLine();
        car1.setModel(M1);
        System.out.println("2nd Car is=");
        String M2 = scan.nextLine();
        car2.setModel(M2);
        System.out.println("3rd Car is=");
        String M3 = scan.nextLine();
        car3.setModel(M3);
        System.out.println("4th Car is=");
        String M4 = scan.nextLine();
        car4.setModel(M4);
        System.out.println("5th Car is=");
        String M5 = scan.nextLine();
        car5.setModel(M5);

        for (int round = 1; round <= 10; round++) {
            System.out.println("\nSpeed of "+M1+"= " + random.nextInt(500));
            int speed1 = random.nextInt(500);
            car1.setSpeed(speed1);
            int S1 = car1.getSpeed();
            int D1 = round * S1;

            System.out.println("\nSpeed of "+M2+"= " + random.nextInt(500));
            int speed2 = random.nextInt(500);
            car2.setSpeed(speed2);
            int S2 = car2.getSpeed();
            int D2 = round * S2;

            System.out.println("\nSpeed of "+M3+"= " + random.nextInt(500));
            int speed3 = random.nextInt(500);
            car3.setSpeed(speed3);
            int S3 = car3.getSpeed();
            int D3 = round * S3;

            System.out.println("\nSpeed of "+M4+"= " + random.nextInt(500));
            int speed4 = random.nextInt(500);
            car4.setSpeed(speed4);
            int S4 = car4.getSpeed();
            int D4 = round * S4;

            System.out.println("\nSpeed of "+M5+"= " + random.nextInt(500));
            int speed5 = random.nextInt(500);
            car5.setSpeed(speed5);
            int S5 = car5.getSpeed();
            int D5 = round * S5;

            System.out.printf("After"+round+"hour/s ");
            System.out.println(M1 + "------------- " + D1 + "km passed");
            System.out.println(M2 + "------------- " + D2 + "km passed");
            System.out.println(M3 + "------------- " + D3 + "km passed");
            System.out.println(M4 + "------------- " + D4 + "km passed");
            System.out.println(M5 + "------------- " + D5 + "km passed");


            if (round == 10) {

                if (D1 > D2 && D1 > D3 && D1 > D4 && D1 > D5) {
                    System.out.println(M1 + " has won the race");
                } else if (D2 > D1 && D2 > D3 && D2 > D4 && D2 > D5) {
                    System.out.println(M2 + " has won the race");
                } else if (D3 > D1 && D3 > D2 && D3 > D4 && D3 > D5) {
                    System.out.println(M3 + " has won the race");
                } else if (D4 > D1 && D4 > D2 && D4 > D3 && D4 > D5) {
                    System.out.println(M4 + " has won the race");
                } else if (D5 > D1 && D5 > D2 && D5 > D3 && D5 > D4) {
                    System.out.println(M5 + " has won the race");
                } else
                    break;

            }
        }
    }
}