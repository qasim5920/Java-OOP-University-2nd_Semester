package com.oop.lab.overriding;

public class Circle extends Shape {
    private double radius;
    private double area;
    private double perimeter;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void calculateArea(){
    area=(radius*radius)*Math.PI;
    System.out.println("Area of circle:"+area);
    }
    public void calculatePerimeter(){
     perimeter=2*(Math.PI*radius);
        System.out.println("perimeter of circle:"+perimeter);
    }

}
