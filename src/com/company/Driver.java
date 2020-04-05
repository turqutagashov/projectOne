package com.company;

public class Driver {
    private String name;
    private String nationality;
    private String teamName;
    private int age;

    public Driver(String name, String nationality, String teamName, int age){
        this.name = name;
        this.nationality = nationality;
        this.teamName = teamName;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public String getTeamName(){
        return teamName;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void introduceSelf(){
        System.out.printf("My name is %s. ", name);
        System.out.printf("I am %s. ", nationality);
        System.out.printf("I am %s years old.\n", age);
        System.out.println("Team: " + teamName);
    }

}
