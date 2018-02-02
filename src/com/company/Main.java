package com.company;

import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome, here you can model your own car");
        System.out.println("please pick a car from one of the following brands:");
        System.out.println("(toyota, chevrolet, nissan, ferrari)");

        Car ferrari = new Car(2017, "red", "California T", 150);
        Car nissan = new Car(2018, "silver", "frontier", 115);
        Car chevrolet = new Car(2018, "golden", "corvette", 120);
        Car toyota = new Car(2000, "purple", "land cruiser", 90);
        Scanner input = new Scanner(System.in);
        String fre = input.nextLine();

            if (fre.equalsIgnoreCase("toyota")) {
                System.out.println("year: " + toyota.getYear());
                System.out.println("color: " + toyota.getColor());
                System.out.println("model: " + toyota.getModel());
                System.out.println("speed: " + toyota.getSpeed() + " miles/hour");
            } else if (fre.equalsIgnoreCase("chevrolet")) {
                System.out.println("year: " + chevrolet.getYear());
                System.out.println("color: " + chevrolet.getColor());
                System.out.println("model: " + chevrolet.getModel());
                System.out.println("speed: " + chevrolet.getSpeed() + " miles/hour");
            } else if (fre.equalsIgnoreCase("nissan")) {
                System.out.println("year: " + nissan.getYear());
                System.out.println("color: " + nissan.getColor());
                System.out.println("model: " + nissan.getModel());
                System.out.println("speed: " + nissan.getSpeed() + " miles/hour");
            } else if (fre.equalsIgnoreCase("ferrari")) {
                System.out.println("year: " + ferrari.getYear());
                System.out.println("color: " + ferrari.getColor());
                System.out.println("model: " + ferrari.getModel());
                System.out.println("speed: " + ferrari.getSpeed() + " miles/hour");
            }

                System.out.println();
            System.out.println("Ok, let's test your " + fre);
    }
}