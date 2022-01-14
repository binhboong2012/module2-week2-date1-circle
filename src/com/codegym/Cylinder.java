package com.codegym;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {// the tich cua hinh tru: pi*r*r*h
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height " + height + " and radius " + this.getRadius() + " and color " + this.getColor();
    }
}
