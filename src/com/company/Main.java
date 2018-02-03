package com.company;

import java.util.InputMismatchException;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome, here you can model your own car");
        System.out.println("please pick a car from one of the following brands:");
        System.out.println("(enter 1 for toyota, enter 2 for chevrolet, enter 3 for nissan, enter 4 for ferrari)");

        Car ferrari = new Car(2017, "red", "California T", 150, "ferrari");
        Car nissan = new Car(2018, "silver", "frontier", 115, "nissan");
        Car chevrolet = new Car(2018, "golden", "corvette", 120, "chevrolet");
        Car toyota = new Car(2000, "purple", "land cruiser", 90, "toyota");
        Scanner input = new Scanner(System.in);

        int fre;
        do {

            try { System.out.println("Please enter a number from 1 to 4!!");
                fre = input.nextInt();

                if (fre == 1) {
                    System.out.println("brand: " + toyota.getBrand());
                    System.out.println("year: " + toyota.getYear());
                    System.out.println("color: " + toyota.getColor());
                    System.out.println("model: " + toyota.getModel());
                    System.out.println("speed: " + toyota.getSpeed() + " miles/hour");
                    System.out.println();
                    String toyota1 = "toyota";
                    System.out.println("Ok, let's test your " + toyota1);
                    System.out.println();
                    System.out.println("you can accelerate pressing 1");
                    System.out.println("you can decelerate pressing 2");
                    fre = input.nextInt();
                } else if (fre == 2) {
                    System.out.println("brand: " + chevrolet.getBrand());
                    System.out.println("year: " + chevrolet.getYear());
                    System.out.println("color: " + chevrolet.getColor());
                    System.out.println("model: " + chevrolet.getModel());
                    System.out.println("speed: " + chevrolet.getSpeed() + " miles/hour");
                    System.out.println();
                    String chevrolet1 = "chevrolet";
                    System.out.println("Ok, let's test your " + chevrolet1);
                    System.out.println();
                    System.out.println("you can accelerate pressing 1");
                    System.out.println("you can decelerate pressing 2");
                    fre = input.nextInt();
                } else if (fre == 3) {
                    System.out.println("brand: " + nissan.getBrand());
                    System.out.println("year: " + nissan.getYear());
                    System.out.println("color: " + nissan.getColor());
                    System.out.println("model: " + nissan.getModel());
                    System.out.println("speed: " + nissan.getSpeed() + " miles/hour");
                    System.out.println();
                    String nissan1 = "nissan";
                    System.out.println("Ok, let's test your " + nissan1);
                    System.out.println();
                    System.out.println("you can accelerate pressing 1");
                    System.out.println("you can decelerate pressing 2");
                    fre = input.nextInt();
                } else if (fre == 4) {
                    System.out.println("brand: " + ferrari.getBrand());
                    System.out.println("year: " + ferrari.getYear());
                    System.out.println("color: " + ferrari.getColor());
                    System.out.println("model: " + ferrari.getModel());
                    System.out.println("speed: " + ferrari.getSpeed() + " miles/hour");
                    System.out.println();
                    String ferrari1 = "ferrari";
                    System.out.println("Ok, let's test your " + ferrari1);
                    System.out.println();
                    System.out.println("you can accelerate pressing 1");
                    System.out.println("you can decelerate pressing 2");
                    fre = input.nextInt();
                }
            } catch (InputMismatchException ime) {
                System.out.println("please enter a number from 1 to 4!!");
                fre = input.nextInt();
            }

        } while (fre >= 5 || fre <= 0);

            Speed cars = new Speed(100,80,125,105,130,110,160,140);

            if (fre == 1) {
                System.out.print("your are accelerating: " + cars.getToyotaAceleration());

            } else if (fre == 2){
                System.out.print("you are decelerating: " + cars.getToyotaDeceleration());

            }
    }
}