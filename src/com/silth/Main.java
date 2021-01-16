package com.silth;

import com.silth.type.Type;

public class Main {
    private static Type type = Type.MOTORCYCLE;
    public static void main(String[] args) {
	    if(type.equals(Type.VEHICLE)){
	        Vehicle vehicle = new Vehicle("White","2021", 4,2000);
	        vehicle.car();
        }else{
            Vehicle vehicle = new Vehicle("Brown","2021", 1,250);
            vehicle.motorcycle();
        }
    }
}
