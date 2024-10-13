package com.patterns.creational.prototype;

public class Rectangle extends IShape {
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        if (rectangle != null) {
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}
