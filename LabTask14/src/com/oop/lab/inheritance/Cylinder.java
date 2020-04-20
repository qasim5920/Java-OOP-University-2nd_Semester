
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.inheritance;

/**
 *
 * @author Qasim Tariq
 */
public class Cylinder extends Circle{
    private int height;
    private double volume;
    public Cylinder(int height, String Color, double radius) {
        super(Color, radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public void calculateVolume(){
        volume=(2*getRadius())*Math.PI*height;
        System.out.println("volume"+volume);
    }

}