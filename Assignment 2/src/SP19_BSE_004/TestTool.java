package SP19_BSE_004;
import java.util.Scanner;
import java.util.ArrayList;
public class TestTool {
    public static void main(String[] args) {
        ArrayList<Truck> T = new ArrayList<Truck>();
        Scanner input1= new Scanner(System.in);
        System.out.println("Enter the number of trucks that crossed the TOLL");
        int N=input1.nextInt();

        for (int i=0;i<=N;i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("press 1 for Ford");
            System.out.println("press 2 for Daewoo");
            System.out.println("press 3 for Nissan");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter number of Axles");
                int A = input.nextInt();
                System.out.println("Enter Weight");
                int W = input.nextInt();
                T.add(new FordTruck(A, W));

            } else if (choice == 2) {
                System.out.println("Enter number of Axles");
                int A = input.nextInt();
                System.out.println("Enter Weight");
                int W = input.nextInt();
                T.add(new DaewooTruck(A, W));
            } else if (choice == 3) {
                System.out.println("Enter number of Axles");
                int A = input.nextInt();
                System.out.println("Enter Weight");
                int W = input.nextInt();
                T.add(new NissanTruck(A, W));
            } else {
                System.out.println("invalid entry");
            }
            ;

        }
            TollBooth booth = new RaviTollBooth();
            TollBooth booth2 = new IslamabadTollBooth();
            booth.displayData(T);
            booth2.displayData(T);

        }
    }
