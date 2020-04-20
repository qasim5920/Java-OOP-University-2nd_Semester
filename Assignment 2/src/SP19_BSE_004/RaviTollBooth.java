package SP19_BSE_004;

import java.util.*;
public class RaviTollBooth extends TollBooth {
    double toll;
    int num;


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
        num++;
        double toll1=0;
        int axle_toll=truck.getAxle()*5;
        double ton=(truck.getWeight()/907.185);
        if(ton<30)
        {
            toll=(ton/2)*10;
        }
        if(ton>=30)
        {
            toll=(ton/2)*5;
        }

        double tol=axle_toll+toll;
        this.toll=this.toll+tol;
        return tol;
    }
}
