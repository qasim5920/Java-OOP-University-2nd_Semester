
package com.oop.lab.inheritance;

/**
 *
 * @author Qasim Tarq
 */
import java.util.Scanner;
    public class CircleTest {
        public static void main(String []args){
            Scanner input = new Scanner(System.in);
            double radius= input.nextDouble();
            String color = input.nextLine();
            int height= input.nextInt();
            Cylinder obj = new Cylinder(height,color,radius);
            obj.calculateArea();
            obj.calculateVolume();
        }
    }
