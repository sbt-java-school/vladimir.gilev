package com.vngilev.homework2_2.interfaces;

public interface ITruck {
    int getTruckLoadRating();

    void putItemOnTruck(Object item);

    int getQuantityOfLoaded();

    int getWeightOfLoaded();
}
