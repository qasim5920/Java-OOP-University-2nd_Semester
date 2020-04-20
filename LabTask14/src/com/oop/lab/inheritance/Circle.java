package com.oop.lab.inheritance;

class Circle {
    private String Color;
    private double radius;
    private double area;
    public Circle(String Color, double radius) {
        this.Color = Color;
        this.radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public double getRadius() {
        return radius;
    }
    public void calculateArea(){
        area=(2* radius)*Math.PI;
        System.out.print("Area:"+area);

    }
}
//Qasim Tariq