package com.vngilev.homework2_1;

/**
 * Created by 1 on 07.08.2016.
 */
public class Truck {
    int truckLoadRating = 0;
    Integer[] basket;
    int basketLoad = 0;
    int countLoad = 0;

    public Integer[] getBasket() {
        return basket;
    }

    public int getBasketLoad() {
        return basketLoad;
    }

    public int getTruckLoadRating() {
        return truckLoadRating;
    }

    public Truck() {

    }

    public Truck(String params) {
        this.basket = new Integer[Integer.parseInt(params.split(" ")[0])];
        this.truckLoadRating = Integer.parseInt(params.split(" ")[1]);

    }

    public int getCurrentItemOfLoad() {
        return this.basket[countLoad - 1];
    }


    public int getCountLoad() {
        return countLoad;
    }

    public boolean truckLoading(int newLoad) {
        if (basketLoad + newLoad > truckLoadRating) {
            System.out.println("Пропускаю груз: " + newLoad);
            return false;
        } else {
            basket[countLoad++] = newLoad;
            basketLoad += newLoad;
            System.out.println("Загружен груз: " + newLoad);
            return true;
        }
    }
}
