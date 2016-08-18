package com.vngilev.homework2_2.Int;

import com.vngilev.homework2_2.interfaces.ITruck;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class IntTruck implements ITruck {
    int TruckLoadRating = 0;
    int quantityOfLoaded = 0;
    int weightOfLoaded = 0;
    Integer[] basket;

    public IntTruck(String inPath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(inPath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String string = "";
            if ((string = bufferedReader.readLine()) != null) {
                //System.out.println("Первая строка входного файла: " + string);
                this.basket = new Integer[Integer.parseInt(string.split(" ")[0])];
                this.TruckLoadRating = Integer.parseInt(string.split(" ")[1]);
            }

        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getTruckLoadRating() {
        return TruckLoadRating;
    }

    @Override
    public void putItemOnTruck(Object item) {
        if (item != null) {
            this.basket[++quantityOfLoaded - 1] = (Integer) item;
            this.weightOfLoaded += (Integer) item;
        }
    }

    @Override
    public int getQuantityOfLoaded() {
        return this.quantityOfLoaded;
    }

    @Override
    public int getWeightOfLoaded() {
        return this.weightOfLoaded;
    }
}
