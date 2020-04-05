package com.company;

public class Car {
    private String nameModel;
    private int carNumber;
    int speed;
    Driver carOwner;

    Car(String nameModel, int carNumber, int speed){
        this.nameModel = nameModel;
        this.speed = speed;
        this.carNumber = carNumber;
    }

    public String getNameModel(){
        return nameModel;
    }

    public void setNameModel(String name){
        this.nameModel = nameModel;
    }

    public int getCarNumber(){
        return carNumber;
    }

    public void setCarNumber(int carNumber){
        this.carNumber = carNumber;
    }

    void introduceCar(){
        System.out.printf("The model of this car is %s. ", nameModel);
        System.out.printf("Its speed is %s kph.\n", speed);
        System.out.println("Car number: " + carNumber);
    }

}
