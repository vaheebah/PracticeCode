package com.overriding;
public class Circle extends Shape {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    public double calculateArea() {

        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {

        return 2 * Math.PI * radius;
    }
}
