package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Race {
    public static void main(String[] args) {

        Driver d1 = new Driver("Lewis Hamilton", "English","Mercedes", 35);
        Driver d2 = new Driver("Sebastian Vettel", "German","Ferrari", 33);
        Driver d3 = new Driver("Max Verstappen", "Dutch","Red Bull Racing", 23);
        Driver d4 = new Driver("Kimi Räikkönen", "Finnish","Alfa Romeo Racing", 40);

        Car c1 = new Car("Mercedes", 44, 300);
        Car c2 = new Car("Ferrari", 5, 290);
        Car c3 = new Car("Honda", 33, 275);
        Car c4 = new Car("Ferrari", 7, 260);

        c1.carOwner = d1;
        c2.carOwner = d2;
        c3.carOwner = d3;
        c4.carOwner = d4;

        ArrayList<Integer> array = new ArrayList<>();
        array.add(c1.speed);
        array.add(c2.speed);
        array.add(c3.speed);
        array.add(c4.speed);

        Collections.sort(array);

        System.out.println("The Winner of The Race:");

        int maxSpeed = array.get(array.size() - 1);

        if(maxSpeed == c1.speed) {
            c1.carOwner.introduceSelf();
            c1.introduceCar();
        } else if(maxSpeed == c2.speed){
            c2.carOwner.introduceSelf();
            c2.introduceCar();
        } else if(maxSpeed == c3.speed){
            c3.carOwner.introduceSelf();
            c3.introduceCar();
        } else if(maxSpeed == c4.speed){
            c4.carOwner.introduceSelf();
            c4.introduceCar();
        }

    }

}
