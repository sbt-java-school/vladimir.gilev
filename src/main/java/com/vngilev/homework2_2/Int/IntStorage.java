package com.vngilev.homework2_2.Int;

import com.vngilev.homework2_2.interfaces.IStorage;

import java.io.*;

public class IntStorage implements IStorage {
    private Integer[] storageQueue;
    private int countStorageQueue = 0;

    @Override
    public boolean isEmpty() {
        return false;
    }

    public IntStorage(final String inPath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(inPath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String string = "";
            if ((string = bufferedReader.readLine()) != null) {
                System.out.println("Первая строка входного файла: " + string);
                this.storageQueue = new Integer[Integer.parseInt(string.split(" ")[0])];
            }
            if ((string = bufferedReader.readLine()) != null) {
                System.out.println("Первая строка входного файла: " + string);
                for (int i = 0; i < this.storageQueue.length; i++) {
                    this.storageQueue[i] = Integer.parseInt(string.split(" ")[i]);
                }
            }
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getItem() {
        if (countStorageQueue < storageQueue.length) {
            return storageQueue[countStorageQueue++];
        } else return null;
    }
}
