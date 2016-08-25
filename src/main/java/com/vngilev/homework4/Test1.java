package com.vngilev.homework4;

import java.util.HashMap;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        //Prepare Trucks to accounting
        List<Truck> truckList = new TruckDAOImpl().list();
        System.out.println("Все авто:");
        System.out.println(truckList);
        System.out.println("");

        MultiMapTruck truckMap = new MultiMapTruckImpl();

        // Initialization TruckMap
        for (Truck truck : truckList) {
            truckMap.put(truck.getType(), truck);
        }
        System.out.println("Пример c мапой Грузовиков:");
        System.out.println("Марка MAN -> "+ truckMap.get("MAN"));
        System.out.println("Марка MERSEDES BENZ -> "+ truckMap.get("MERSEDES BENZ"));
        System.out.println("Марка GAZ -> "+ truckMap.get("GAZ"));
        System.out.println("Марка GA -> "+ truckMap.get("GA"));

        MultiMap<String, Truck> multiMapTruck = new MultiMapImpl<>();

        // Initialization parametrized Map by the example of the class "Truck" or "Superclass"
        for (Truck truck :  truckList) {
            multiMapTruck.put(truck.getType(), truck);
        }
        System.out.println("");
        System.out.println("Пример с параметризированной мапой Грузовиков:");
        System.out.println("Марка MAN -> "+multiMapTruck.get("MAN"));
        System.out.println("Марка MERSEDES BENZ -> "+multiMapTruck.get("MERSEDES BENZ"));
        System.out.println("Марка GAZ -> "+multiMapTruck.get("GAZ"));
        System.out.println("Марка GA -> "+multiMapTruck.get("GA"));

        MultiMap<Integer, String> multiMapString = new MultiMapImpl<>();
        // Initialization parametrized Map by the example of the class "String"
        for (int i = 0; i < 3; i++) {
            multiMapString.put(i, "ABC"+i);
            multiMapString.put(i+1, "DEF"+i);
            multiMapString.put(i+2, "GHI"+i);
        }

        System.out.println("");
        System.out.println("Пример c мапой строк:");
        System.out.println(multiMapString.get(0));
        System.out.println(multiMapString.get(1));
        System.out.println(multiMapString.get(2));
        System.out.println(multiMapString.get(3));
        System.out.println(multiMapString.get(4));

//        for (int i = 0; i < multiMapString.; i++) {
//
//        }
    }
}