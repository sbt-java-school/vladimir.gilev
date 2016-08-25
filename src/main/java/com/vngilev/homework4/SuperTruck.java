package com.vngilev.homework4;

/**
 * Created by 1 on 25.08.2016.
 */
public class SuperTruck extends Truck {
    public final int maxSpeed = 60;

    public SuperTruck(long id, String type, int capacity) {
        super(id, type, capacity);
    }

    @Override
    public String toString() {
        return "SuperTruck:"+ super.toString().split(":")[1].split("]")[0] + ", "+this.maxSpeed+"]" ;

    }
}
