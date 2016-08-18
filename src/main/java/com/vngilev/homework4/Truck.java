package com.vngilev.homework4;

/**
 * Created by 1 on 16.08.2016.
 */
public class Truck {
    private long id;
    private String model;
    private int capacity;


    public Truck(long id, String model, int capacity) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return this.model;
    }

    public long getId() {
        return this.id;
    }


    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString() {
        return "Truck: id=" + this.id + ", model=" + this.model + ", capacity=" + this.capacity;
    }
}