package com.company;

public class Car {
    String nameModel;
    int carNumber;
    int speed;
    Driver carOwner;

    Car(String nameModel, int carNumber, int speed){
        this.nameModel = nameModel;
        this.speed = speed;
        this.carNumber = carNumber;
    }

    void introduceCar(){
        System.out.printf("The model of this car is %s. ", nameModel);
        System.out.printf("Its speed is %s kph.\n", speed);
        System.out.println("Car number: " + carNumber);
    }

}
