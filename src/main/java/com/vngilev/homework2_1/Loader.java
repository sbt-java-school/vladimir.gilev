package com.vngilev.homework2_1;

/**
 * Created by 1 on 07.08.2016.
 */
public class Loader {
    Integer[] queueOfLoad;
    int counterOfQueue = 0;

    public Loader() {

    }

    public Loader(String q) {
        String[] queueOfLoad = q.split(" ");
        this.queueOfLoad = new Integer[queueOfLoad.length];
        for (int i = 0; i < queueOfLoad.length; i++) {
            this.queueOfLoad[i] = Integer.parseInt(queueOfLoad[i]);
        }
    }

    public int putItem() {
        if (!isLoaderEmpty()) {
            return queueOfLoad[counterOfQueue++];
        } else return 0;
    }

    public boolean isLoaderEmpty() {
        return counterOfQueue >= queueOfLoad.length;
    }

}
