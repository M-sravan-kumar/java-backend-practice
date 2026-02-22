package org.example.factory.example2;

public class Tata {

    private String vehicleType;

    public Tata(String str)
    {
        this.vehicleType = str;
    }

    public Car createCar()
    {
        return CarFactory.getCar(vehicleType);
    }

}
