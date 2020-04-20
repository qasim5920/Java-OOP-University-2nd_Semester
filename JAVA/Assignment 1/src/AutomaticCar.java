public class AutomaticCar
{
    private String Model;
    private int Year;
    private int Speed;
    private int Gear;

    public void setModel(String model)
    {
        this.Model=model;
    }
    public String getModel()
    {
        return Model;
    }
    public  void setYear(int year)
    {
        this.Year=year;
    }
    public int getYear()
    {
        return Year;
    }
    public void setSpeed(int speed)
    {
        this.Speed=speed;

        if(speed<0 || speed>500)
            System.out.println("Error");
        else if(speed==0)
            System.out.println("  Gear = 00");
        else if (speed>1 && speed<=100)
            System.out.println("  Gear = 01");
        else if(speed>100 && speed<=200)
            System.out.println("  Gear = 02");
        else if(speed>200 && speed<=300)
            System.out.println("  Gear = 03");
        else if (speed>300 && speed<=400)
            System.out.println("  Gear = 04");
        else if (speed>400 && speed<=500)
            System.out.println("  Gear = 05");

    }
    public int getSpeed()
    {
        return Speed;
    }

}