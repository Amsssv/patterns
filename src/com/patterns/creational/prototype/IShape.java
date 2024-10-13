package com.patterns.creational.prototype;

public abstract class IShape {
    private int x;
    private int y;
    private String color;

    public IShape() {}

    public IShape(IShape geometry) {
        if (geometry != null) {
            this.x = geometry.x;
            this.y = geometry.y;
            this.color = geometry.color;
        }
    }

    public abstract IShape clone();
}
