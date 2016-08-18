package com.vngilev.homework2_2;

import com.vngilev.homework2_2.Int.IntLoader;
import com.vngilev.homework2_2.Int.IntStorage;
import com.vngilev.homework2_2.Int.IntTruck;
import com.vngilev.homework2_2.Str.StrLoader;
import com.vngilev.homework2_2.Str.StrStorage;
import com.vngilev.homework2_2.Str.StrTruck;
import com.vngilev.homework2_2.interfaces.ILoader;
import com.vngilev.homework2_2.interfaces.IStorage;
import com.vngilev.homework2_2.interfaces.ITruck;

import java.io.*;

public class Foreman {

    public static void main(final String[] args) {
//        IntStorage storage = new IntStorage(args[0]);
//        IntTruck truck = new IntTruck(args[0]);
//        IntLoader loader = new IntLoader();

        StrStorage strStorage = new StrStorage(args[0]);
        StrTruck strTruck = new StrTruck(args[0]);
        StrLoader strLoader = new StrLoader();

//        Foreman foreman = new Foreman();
//        foreman.loading(storage,truck,loa  der);
//        foreman.saveReport(args[1],truck);

        Foreman foreman = new Foreman();
        foreman.loading(strStorage, strTruck, strLoader);
        foreman.saveReport(args[1], strTruck);


    }


    void loading(IStorage iStorage, ITruck iTruck, ILoader iLoader) {
        Object item;
        while ((item = iStorage.getItem()) != null) {
            iLoader.takeItem(item);
            System.out.println("Грузчик взял груз " + item.toString() + ".");
            if (iTruck.getWeightOfLoaded() + iLoader.getWeigthOfItem() < iTruck.getTruckLoadRating()) {
                iTruck.putItemOnTruck(iLoader.giveItem());
                System.out.println("Грузчик поместил груз " + item.toString() + " в кузов грузовика.");
            } else if (iTruck.getWeightOfLoaded() + iLoader.getWeigthOfItem() == iTruck.getTruckLoadRating()) {
                iTruck.putItemOnTruck(iLoader.giveItem());
                System.out.println("Грузчик поместил груз " + item.toString() + " в кузов грузовика.");
                System.out.println("Грузовик заполнен! Стоп!");
                break;
            } else {
                System.out.println("Грузчик убрал груз " + item.toString() + " в сторону.");
            }
        }
    }

    void saveReport(String outPath, ITruck iTruck) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(outPath);
            fileOutputStream.write((iTruck.getQuantityOfLoaded() + " " + iTruck.getWeightOfLoaded()).getBytes());
            System.out.println("В кузове грузовика " + iTruck.getQuantityOfLoaded() + " груза(-ов) общей массой " + iTruck.getWeightOfLoaded() + ".");
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
