package Task1;

import java.util.Scanner;
    public class Main{

        public static void main(String args[])
        {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter day");
            int day= input.nextInt();
            System.out.println("Enter month");
            int month= input.nextInt();
            System.out.println("Enter year");
            int year= input.nextInt();
            System.out.println("Enter second");
            int sec= input.nextInt();
            System.out.println("Enter minute");
            int min= input.nextInt();
            System.out.println("Enter hour");
            int hour= input.nextInt();
            Ticker date = new Date(day,month,year);
            Ticker time = new Time(sec,min,hour);

            System.out.println(date.toString());
            System.out.println(time.toString());

            date.Tick();
            time.Tick();

        }
}
