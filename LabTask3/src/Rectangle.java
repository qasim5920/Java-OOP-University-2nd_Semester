public class Rectangle {
    public double length=7.7;
    public double width=4.4;
    public double p;
    public void calculateArea(){
        System.out.println("Area of Rectangle="+length*width);
    }
    public void calculatePerimeter(){
        p= length+width;
        System.out.println("perimeter of Rectangle="+2*p);
    }
}
