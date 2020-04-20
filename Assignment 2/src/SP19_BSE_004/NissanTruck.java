package SP19_BSE_004;

public class NissanTruck  extends Truck {

    private int axle;
    private double weight;

    public NissanTruck(int axle, double weight) {
        this.axle = axle;
        this.weight = weight;
    }


    public int getAxle() {
        return axle;
    }

    protected void setAxle(int axle) {
        this.axle = axle;
    }

    public double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public void displayData()
    {
        System.out.println("Number of Axles: "+axle+"\n Weight of Truck: "+weight);
    }

}
