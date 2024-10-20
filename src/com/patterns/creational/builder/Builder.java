package com.patterns.creational.builder;

public interface Builder {
    void setCarType(CarType type );
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setColor(String color);
}
