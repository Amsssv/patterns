package com.patterns.creational.builder;

public class ManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private String color;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, color);
    }
}
