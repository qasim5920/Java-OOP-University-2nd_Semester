package task2;

public class Cylinder extends Circle{
    private double height;
    private double area;

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void calculateArea(){
    area= 2*((Math.PI*(getRadius()*getRadius())) + (Math.PI*getRadius()*height));
        System.out.println("Color of Cylinder:"+getColor());
        System.out.println("radius of Cylinder:"+getRadius());
        System.out.println("height of Cylinder:"+height);
        System.out.println("Area of Cylinder:"+area);
    }
}
