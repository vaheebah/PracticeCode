package com.oop.lab.inheritance;

import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color:");
        String cylColor = sc.nextLine();
        System.out.println("Enter radius:");
        double cylRadius = sc.nextDouble();
        System.out.println("Enter height:");
        double cylHeight = sc.nextDouble();

        Cylinder cylinderObj = new Cylinder(cylColor, cylRadius, cylHeight);
        double finalArea = cylinderObj.calculateArea();

        System.out.println("Area of cylinder: " + finalArea);
        sc.close();
    }
}

