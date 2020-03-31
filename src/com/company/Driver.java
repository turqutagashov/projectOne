package com.company;

public class Driver {
    String name;
    String nationality;
    String teamName;
    int age;

    Driver(String name, String nationality, String teamName, int age){
        this.name = name;
        this.nationality = nationality;
        this.teamName = teamName;
        this.age = age;
    }

    void introduceSelf(){
        System.out.printf("My name is %s. ", name);
        System.out.printf("I am %s. ", nationality);
        System.out.printf("I am %s years old.\n", age);
        System.out.println("Team: " + teamName);
    }

}
