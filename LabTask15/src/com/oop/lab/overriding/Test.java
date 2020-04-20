package com.oop.lab.overriding;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import java.util.Scanner;
public class Test {
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter color of circle:");
    String color=input.nextLine();
    System.out.println("Enter color of rectangle:");
    String color1=input.nextLine();
    System.out.println("Enter radius of circle:");
    double radius=input.nextDouble();
    System.out.println("Enter width of rectangle:");
    double width=input.nextDouble();
    System.out.println("Enter height of rectangle:");
    double height=input.nextDouble();
    Circle C1 = new Circle(color,radius);
    Rectangle R1= new Rectangle(color1,width,height);
    System.out.println("color of circle:"+color);
    System.out.println("color of rectangle:"+color1);
    C1.calculateArea();
    C1.calculatePerimeter();
    R1.calculateArea();
    R1.calculatePerimeter();
}
}
