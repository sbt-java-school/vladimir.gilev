package com.vngilev.homework4;

import java.util.List;

public interface MultiMapTruck {
    List<Truck> get(String type);
    void put(String type, Truck truck);
}
