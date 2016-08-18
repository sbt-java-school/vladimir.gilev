package com.vngilev.homework4;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 1 on 16.08.2016.
 */
public class TruckDAOMemoryImpl implements TruckDAO{
    public List<Truck> list(){
        return Arrays.asList(
                new Truck(1L, "BELAZ", 10),
                new Truck(2L, "AVTOVAZ",30),
                new Truck(3L, "KAMAZ",50),
                new Truck(4L, "MERSEDES BENZ",60),
                new Truck(5L, "VOLVO",30),
                new Truck(6L, "VOLVO",30),
                new Truck(7L, "VOLVO",30),
                new Truck(8L, "VOLVO",30),
                new Truck(9L, "VOLVO",30),
                new Truck(10L, "VOLVO",30)
        );
    }

}
