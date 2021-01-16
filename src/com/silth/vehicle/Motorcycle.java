package com.silth.vehicle;

public class Motorcycle extends Vehicle{
    public Motorcycle(String colour, String year, Integer power) {
        this.colour = colour;
        this.year = year;
        this.power = power;

        configureMotorcycle();
    }

    public void configureMotorcycle() {
        System.out.println("Motorcycle{" +
                "colour='" + colour + '\'' +
                ", year='" + year + '\'' +
                ", power=" + power +
                '}');
        this.starVehicle();
    }
}
