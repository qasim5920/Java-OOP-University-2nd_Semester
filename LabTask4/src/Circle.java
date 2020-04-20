public class Circle {
    private double radius=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println("The area of cirlce="+radius*radius*Math.PI);
    }
    public void calculatePerimeter(){
        System.out.println("The area of cirlce="+2*radius*Math.PI);
    }
}
