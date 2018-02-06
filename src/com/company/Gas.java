package com.company;

public class Gas extends Car{

    private int gasoline;

    public Gas(int year, String color, String model, int speed, String brand, int gasoline) {
        super(year, color, model, speed, brand);
        this.gasoline = gasoline;
    }

    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }
}
