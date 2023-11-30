/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan15_testcylinder;

/**
 *
 * Created By_22343075_SYauqi revo mardian
 */

public class Cylinder extends Circle {
    // private instance variable
    private double height;

    // Constructors
    public Cylinder() {
        super();  // invoke superclass' constructor Circle()
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");  // for debugging
    }

    public Cylinder(double height) {
        super();  // invoke superclass' constructor Circle()
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");  // for debugging
    }

    public Cylinder(double height, double radius) {
        super(radius);  // invoke superclass' constructor Circle(radius)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");  // for debugging
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);  // invoke superclass' constructor Circle(radius, color)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");  // for debugging
    }

    // Getter and Setter
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /** Returns the volume of this Cylinder */
    public double getVolume() {
        return getArea() * height;   // Use Circle's getArea()
    }

    /** Returns a self-descriptive String */
    public String toString() {
        return "This is a Cylinder";  // to be refined later
    }

    // You need to implement these methods from the Circle class
    @Override
    public double getArea() {
        // Implement the area calculation for a cylinder (2πrh + 2πr^2)
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    @Override
    public double getRadius() {
        // Implement the radius retrieval for a cylinder
        return super.getRadius();  // Assuming the Circle class has a getRadius method
    }

    @Override
    public String getColor() {
        // Implement the color retrieval for a cylinder
        return super.getColor();  // Assuming the Circle class has a getColor method
    }
}