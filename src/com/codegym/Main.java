package com.codegym;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3, "Black");
        System.out.println(circle);
        System.out.println("The area is " + circle.getArea());
        System.out.println("The radius is " + circle.getRadius());
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3,"red",4);
        System.out.println(cylinder);
        System.out.println("The volume is " + cylinder.getVolume());
    }
}
