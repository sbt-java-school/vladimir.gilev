package com.vngilev.homework4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MultiMapTruckImpl implements MultiMapTruck{

    Map<String, List<Truck>> truckMap = new HashMap<>();

    @Override
    public List<Truck> get(String type) {
        return truckMap.get(type);
    }


    @Override
    public void put(String type, Truck truck) {
        if (type==null||truck==null) {
            System.out.println("Нет аргументов!");
            return;
        }

        if(truckMap.containsKey(type)){
            truckMap.get(type).add(truck);
        } else {
            List<Truck> truckList = new ArrayList<>();
            truckList.add(truck);
            truckMap.put(type, truckList);
        }
    }
}
