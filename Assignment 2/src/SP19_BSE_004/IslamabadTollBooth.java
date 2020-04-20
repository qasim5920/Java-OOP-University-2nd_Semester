package SP19_BSE_004;

import java.util.ArrayList;
public class IslamabadTollBooth extends TollBooth {
    double toll;
    int num;

    @Override
    public void displayData(ArrayList<Truck> Truck)
    {
        for (Truck T: Truck){
            arrived(T);
        }
        System.out.println("Total trucks Arrived: "+num+"Total Toll Money: "+toll);
    }


    public void arrived(Truck truck)
    {
        truck.displayData();
        System.out.println("The Truck toll due is: "+calculateTool(truck));

    }

    public double calculateTool(Truck truck)
    {
        ++num;
        int axle_toll=truck.getAxle()*8;
        double half_ton=(truck.getWeight()/907.185)/2;
        double weight=half_ton*12;
        double tol= axle_toll+weight;
        this.toll=this.toll+tol;
        return tol;

    }
}
