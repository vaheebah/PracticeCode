package com.oop.lab.inheritance;
class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double calculateArea() {
        double circleArea = super.calculateArea();
        double lateralArea = 2 * Math.PI * super.getRadius() * getHeight();
        return 2 * circleArea + lateralArea;
    }


}