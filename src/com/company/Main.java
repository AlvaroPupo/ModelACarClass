package com.company;

import java.util.InputMismatchException;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome, here you can model your own car");
        System.out.println("please pick a car from one of the following brands:");
        System.out.println("(enter 1 for toyota, enter 2 for chevrolet, enter 3 for nissan, enter 4 for ferrari, enter 5 to custom your own car)");

        Gas ferrari = new Gas(2015, "golden", "California", 150, "ferrari", 100);
        Gas nissan = new Gas(2016, "silver", "XTerra", 120, "nissan", 100);
        Gas chevrolet = new Gas(2017, "red", "Master", 110, "chevrolet", 100);
        Gas toyota = new Gas(2018, "blue", "Star", 100, "toyota", 100);
        Scanner input = new Scanner(System.in);

        int fre;
        do {

            try {
                System.out.println("Please enter a number from 1 to 5!!");
                fre = input.nextInt();

                if (fre == 1) {
                    System.out.println("brand: " + toyota.getBrand());
                    System.out.println("year: " + toyota.getYear());
                    System.out.println("color: " + toyota.getColor());
                    System.out.println("model: " + toyota.getModel());
                    System.out.println("speed: " + toyota.getSpeed() + " miles/hour");
                    System.out.println();
                    System.out.println("Ok, let's test your " + toyota.getBrand() + " " + toyota.getModel() + " " + toyota.getColor() + " " + toyota.getYear() + " at a speed of " + toyota.getSpeed() + " miles/hour and with a gas tank filled at " + toyota.getGasoline() + "%");
                    System.out.println();
                    System.out.println("you can accelerate by pressing 1 \nyou can decelerate by pressing 2");
                    fre = input.nextInt();

                } else if (fre == 2) {
                    System.out.println("brand: " + chevrolet.getBrand());
                    System.out.println("year: " + chevrolet.getYear());
                    System.out.println("color: " + chevrolet.getColor());
                    System.out.println("model: " + chevrolet.getModel());
                    System.out.println("speed: " + chevrolet.getSpeed() + " miles/hour");
                    System.out.println();
                    System.out.println("Ok, let's test your " + chevrolet.getBrand() + " " + chevrolet.getModel() + " " + chevrolet.getColor() + " " + chevrolet.getYear() + " at a speed of " + chevrolet.getSpeed() + " miles/hour and with a gas tank filled at " + chevrolet.getGasoline() + "%");
                    System.out.println();
                    System.out.println("you can accelerate by pressing 1 \nyou can decelerate by pressing 2");
                    fre = input.nextInt();

                } else if (fre == 3) {
                    System.out.println("brand: " + nissan.getBrand());
                    System.out.println("year: " + nissan.getYear());
                    System.out.println("color: " + nissan.getColor());
                    System.out.println("model: " + nissan.getModel());
                    System.out.println("speed: " + nissan.getSpeed() + " miles/hour");
                    System.out.println();
                    System.out.println("Ok, let's test your " + nissan.getBrand() + " " + nissan.getModel() + " " + nissan.getColor() + " " + nissan.getYear() + " at a speed of " + nissan.getSpeed() + " miles/hour and with a gas tank filled at " + nissan.getGasoline() + "%");
                    System.out.println();
                    System.out.println("you can accelerate by pressing 1 \nyou can decelerate by pressing 2");
                    fre = input.nextInt();

                } else if (fre == 4) {
                    System.out.println("brand: " + ferrari.getBrand());
                    System.out.println("year: " + ferrari.getYear());
                    System.out.println("color: " + ferrari.getColor());
                    System.out.println("model: " + ferrari.getModel());
                    System.out.println("speed: " + ferrari.getSpeed() + " miles/hour");
                    System.out.println();
                    System.out.println("Ok, let's test your " + ferrari.getBrand() + " " + ferrari.getModel() + " " + ferrari.getColor() + " " + ferrari.getYear() + " at a speed of " + ferrari.getSpeed() + " miles/hour and with a gas tank filled at " + ferrari.getGasoline() + "%");
                    System.out.println();
                    System.out.println("you can accelerate by pressing 1 \nyou can decelerate by pressing 2");
                    fre = input.nextInt();

                } else if (fre == 5){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("which brand would you like your car to be?");
                    String CarBrand;
                    CarBrand = sc.nextLine();
                    System.out.println("what model would you like your car to be?");
                    String CarModel;
                    CarModel = sc.nextLine();
                    System.out.println("what year would you like your car to be?");
                    int CarYear;
                    CarYear = sc.nextInt();
                    System.out.println("your new car is " + CarBrand + " " + CarModel + " " + CarYear);
                    System.out.println();
                    System.out.println("you can accelerate by pressing 1 \nyou can decelerate by pressing 2");
                    fre = input.nextInt();
                }
            }catch(InputMismatchException ime) {
                System.out.println("please enter a valid number!!");
                fre = input.nextInt();
            }
        } while (fre >= 6 || fre <= 0) ;

                Speed toyotaSpeed = new Speed("100", "80");
                Speed nissanSpeed = new Speed("125", "105");
                Speed chevroletSpeed = new Speed("130", "110");
                Speed ferrariSpeed = new Speed("160", "140");


            try {
//                System.out.println("please enter a number between 5 and 7!!");       this switch statement doesn't work
//                fre = input.nextInt();                                                         don't use it

//                for (int user = 1; user <= 5; user++) {
//                    switch (input.nextInt()) {
//                        case 1:
//                            toyota.setGasoline(toyota.getGasoline() + 1);
//                            break;
//                        case 2:
//                            nissan.setGasoline(nissan.getGasoline() - 1);
//                            break;
//                        case 3:
//                            user++;
//                            break;
//                    }
//                }
                if (fre == 1) {
                    System.out.println("you are acelerating: " + toyotaSpeed.getAcelerate() + " miles/hour and " + (toyota.getGasoline() - 1) + "% of gasoline.");
                    System.out.println("you are acelerating: " + nissanSpeed.getAcelerate() + " miles/hour and " + (toyota.getGasoline() - 2) + "% of gasoline.");
                    System.out.println("you are acelerating: " + chevroletSpeed.getAcelerate() + " miles/hour and " + (toyota.getGasoline() - 3) + "% of gasoline.");
                    System.out.println("you are acelerating: " + ferrariSpeed.getAcelerate() + " miles/hour and " + (toyota.getGasoline() - 4) + "% of gasoline.");
                    System.out.println();

                } else if (fre == 2) {
                    System.out.println("you are decelerating: " + ferrariSpeed.getDecelerate() + " miles/hour and " + (toyota.getGasoline() - 1) + "% of gasoline.");
                    System.out.println("you are decelerating: " + chevroletSpeed.getDecelerate() + " miles/hour and " + (toyota.getGasoline() - 2) + "% of gasoline.");
                    System.out.println("you are decelerating: " + nissanSpeed.getDecelerate() + " miles/hour and " + (toyota.getGasoline() - 3) + "% of gasoline.");
                    System.out.println("you are decelerating: " + toyotaSpeed.getDecelerate() + " miles/hour and " + (toyota.getGasoline() - 4) + "% of gasoline.");
                    System.out.println();
                }

                System.out.println("you can accelerate by pressing 1 \nyou can decelerate by pressing 2 \nyou can refill gas by pressing 3");
                fre = input.nextInt();

                if (fre == 1) {
                    System.out.println("you are acelerating: " + toyotaSpeed.getAcelerate() + " miles/hour and " + (toyota.getGasoline() - 5) + "% of gasoline.");
                    System.out.println("you are acelerating: " + nissanSpeed.getAcelerate() + " miles/hour and " + (toyota.getGasoline() - 6) + "% of gasoline.");
                    System.out.println("you are acelerating: " + chevroletSpeed.getAcelerate() + " miles/hour and " + (toyota.getGasoline() - 7) + "% of gasoline.");
                    System.out.println("you are acelerating: " + ferrariSpeed.getAcelerate() + " miles/hour and " + (toyota.getGasoline() - 8) + "% of gasoline.");
                    input.nextInt();

                } else if (fre == 2) {
                    System.out.println("you are decelerating: " + ferrariSpeed.getDecelerate() + " miles/hour and " + (toyota.getGasoline() - 5) + "% of gasoline.");
                    System.out.println("you are decelerating: " + chevroletSpeed.getDecelerate() + " miles/hour and " + (toyota.getGasoline() - 6) + "% of gasoline.");
                    System.out.println("you are decelerating: " + nissanSpeed.getDecelerate() + " miles/hour and " + (toyota.getGasoline() - 7) + "% of gasoline.");
                    System.out.println("you are decelerating: " + toyotaSpeed.getDecelerate() + " miles/hour and " + (toyota.getGasoline() - 8) + "% of gasoline.");
                    input.nextInt();

                } else if (fre == 3); {
                    System.out.println("You are refilling gas: " + (toyota.getGasoline() - 3) + "%");
                    System.out.println("you are refilling gas: " + (toyota.getGasoline() - 2) + "%");
                    System.out.println("you are refilling gas: " + (toyota.getGasoline() - 1) + "%");
                    System.out.println("you are refilling gas: " + toyota.getGasoline() + "%");
                }
            }catch (InputMismatchException ime){
                System.out.println("Please enter a valid number!!");
                input.nextInt();
                }
        }
}
