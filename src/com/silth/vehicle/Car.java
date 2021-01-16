package com.silth.vehicle;

public class Car implements IVehicle{
    private String colour;
    private String year;
    private Integer seat;
    private Integer power;

    public Car(String colour, String year, Integer seat, Integer power) {
        this.colour = colour;
        this.year = year;
        this.seat = seat;
        this.power = power;

        configureVehicle();
    }

    @Override
    public void configureVehicle() {
        System.out.println("Car{" +
                "colour='" + colour + '\'' +
                ", year='" + year + '\'' +
                ", seat=" + seat +
                ", power=" + power +
                '}');
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting the car!!!");
    }
}
