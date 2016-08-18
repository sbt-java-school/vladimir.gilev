package com.vngilev.homework2_2.Str;


import com.vngilev.homework2_2.interfaces.ITruck;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class StrTruck implements ITruck {
    int truckLoadRating = 0;
    int quantityOfLoaded = 0;
    int weightOfLoaded = 0;
    String[] basket;

    public StrTruck(String outPath) {


        try {
            FileInputStream fileInputStream = new FileInputStream(outPath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String string = "";
            if ((string = bufferedReader.readLine()) != null) {

                this.basket = new String[Integer.parseInt(string.split(" ")[0])];
                this.truckLoadRating = Integer.parseInt(string.split(" ")[1]);
            }

        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getTruckLoadRating() {
        return truckLoadRating;
    }

    @Override
    public void putItemOnTruck(Object item) {
        if (item != null) {
            this.basket[++quantityOfLoaded - 1] = (String) item;
            this.weightOfLoaded += item.toString().length();
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
