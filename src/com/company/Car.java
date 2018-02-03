package com.company;
import java.util.Scanner;
public class Car {

    private String brand;
    private int year;
    private String color;
    private String model;
    private int speed;

    public Car(int year, String color, String model, int speed, String brand){
        this.year = year;
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.brand = brand;

    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;

    }public String getBrand() {
        return brand;

    } public void setBrand(String brand) {
        this.brand = brand;
    }
}

