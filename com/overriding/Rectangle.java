package com.overriding;
public class Rectangle extends Shape {
    protected double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    protected double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double calculateArea() {
        return width * length;
    }


    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}
