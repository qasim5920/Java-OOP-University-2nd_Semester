package com.oop.lab.overriding;

public class Rectangle extends Shape {
    private double width;
    private double height;
    private double area;
    private double perimeter;
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void calculateArea(){
        area=height*width;
        System.out.println("Area of rectangle:"+area);
    }
    public void calculatePerimeter(){
        perimeter=2*(height*width);
        System.out.println("perimeter of rectangle:"+perimeter);
    }
}
