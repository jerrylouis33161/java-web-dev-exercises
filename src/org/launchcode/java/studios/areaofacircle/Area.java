package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main( String[] args){
        Scanner input;
        double radius;
        double Area;

        input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius = input.nextDouble();
        Area = Circle.getArea(radius); //Math.PI * radius * radius;
        System.out.println("The area of a circle of radius" + " " +radius + " " + "is:" + " " + Area);

    }
}
