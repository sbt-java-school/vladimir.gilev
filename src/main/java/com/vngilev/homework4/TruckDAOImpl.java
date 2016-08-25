package com.vngilev.homework4;


import java.util.Arrays;
import java.util.List;


public class TruckDAOImpl implements TruckDAO {
    public final List<Truck> list() {
        return Arrays.asList(
                new Truck(1L, "GAZ", 10),
                new Truck(2L, "MERSEDES BENZ", 10),
                new SuperTruck(3L, "MAN", 30),
                new SuperTruck(4L, "MAN", 30),
                new Truck(5L, "GAZ", 12),
                new Truck(8L, "GAZ", 10),
                new SuperTruck(9L, "MERSEDES BENZ", 30),
                new Truck(10L, "MAN", 30),
                new Truck(11L, "MAN", 30),
                new Truck(13L, "GAZ", 12),
                new Truck(16L, "MERSEDES BENZ", 10),
                new Truck(17L, "MAN", 30),
                new Truck(18L, "MAN", 30),
                new Truck(19L, "GAZ", 12),
                new Truck(20L, "GAZ", 12),
                new Truck(21L, "GAZ", 10)                );
    }
}
