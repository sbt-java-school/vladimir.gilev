package com.vngilev.homework4;


import java.util.*;

/**
 * Created by 1 on 15.08.2016.
 */
public class TableOfTruck {
    private Map<Long, Truck> truckRegistry = new HashMap<>();


    public TableOfTruck(TruckDAO truckDao) {
        List<Truck> list = truckDao.list();
        for (Truck truck : list) {
            if (null != truckRegistry.put(truck.getId(), truck)) {
                throw new IllegalStateException("Two Truck with one ID");
            }
        }
    }

    public Truck getTruckById(long truckId) {
        Truck truck = truckRegistry.get(truckId);
        if (truck == null) {
            throw new IllegalStateException("not found truck by ID=" + truckId);
        } else return truck;
    }

    void viewTruckRegistry() {

        for (long truckId : truckRegistry.keySet()) {
            System.out.println(getTruckById(truckId).toString());
        }
    }

    private static void printHelp() {
        System.out.println("Use first argument as truck ID");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            printHelp();
            System.exit(1);
        }

        TruckDAO tDao = new TruckDAOMemoryImpl();
        TableOfTruck tableOfTruck = new TableOfTruck(tDao);
        //tableOfTruck.viewTruckRegistry();

        for (Truck truck: tableOfTruck.getTrucksByModel("VOLVO")) {
            System.out.println(tableOfTruck.getTruckById(truck.getId()).toString());
        }
    }
/**
 **
 * Function getTrucksByModel return arrrayList of Trucks for defined in parameter model of Truck
 */
    ArrayList<Truck> getTrucksByModel(String model) {
        ArrayList<Truck> truckList = new ArrayList<Truck>();
        for(Long truckId: truckRegistry.keySet()){
            if (model == truckRegistry.get(truckId).getModel()) {
                truckList.add(getTruckById(truckId));
            }
        }
        return truckList;
    }
}
