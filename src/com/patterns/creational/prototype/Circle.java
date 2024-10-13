package com.patterns.creational.prototype;


public class Circle extends IShape {
    private double radius;

    public Circle() {}

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) {
            this.radius = circle.radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    public void draw() {
        System.out.println("Drawing Circle with radius " + getRadius());
    }
}
