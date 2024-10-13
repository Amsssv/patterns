package com.patterns.creational.prototype;

public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);

        Circle circleClone = circle.clone();
        circleClone.setRadius(2);


       circleClone.draw();
       circle.draw();
    }
}
