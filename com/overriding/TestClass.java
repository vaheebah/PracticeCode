package com.overriding;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter color for Circle:");
        String circleColor = sc.next();
        System.out.println("Enter radius for Circle:");
        double radius = sc.nextDouble();

        System.out.println("Enter color for Rectangle:");
        String rectangleColor = sc.next();
        System.out.println("Enter width for Rectangle:");
        double width = sc.nextDouble();
        System.out.println("Enter length for Rectangle:");
        double length = sc.nextDouble();

        Circle circle = new Circle(circleColor, radius);
        Rectangle rectangle = new Rectangle(rectangleColor, width, length);

        System.out.println("Circle color: " + circleColor);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("\n");
        System.out.println("Rectangle color: " +rectangleColor);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        sc.close();
    }
}
