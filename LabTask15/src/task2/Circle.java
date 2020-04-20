package task2;

public class Circle {
    private String color;
    private double radius;
    private double area;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    public void calculateArea(){
    area= Math.PI*(radius*radius);
    System.out.print("radius of circle"+radius);
    System.out.print("Area of circle"+area);
    }

}
