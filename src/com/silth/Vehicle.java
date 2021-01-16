package com.silth;

public class Vehicle {
    private String colour;
    private String year;
    private Integer seat;
    private Integer power;

    public Vehicle(String colour, String year, Integer seat, Integer power) {
        this.colour = colour;
        this.year = year;
        this.seat = seat;
        this.power = power;
    }

    public void car(){
        System.out.println("Vehicle{" +
                "colour='" + colour + '\'' +
                ", year='" + year + '\'' +
                ", seat=" + seat +
                ", power=" + power +
                '}');
        starVehicle();
    }

    public void motorcycle(){
        System.out.println("Motorcycle{" +
                "colour='" + colour + '\'' +
                ", year='" + year + '\'' +
                ", seat=" + seat +
                ", power=" + power +
                '}');
        starMotorcycle();
    }

    private void starVehicle(){
        System.out.println("Starting car");
    }

    private void starMotorcycle(){
        System.out.println("Starting Motorcycle");
    }
}
