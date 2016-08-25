package com.vngilev.homework4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMapImpl <K,V> implements MultiMap<K,V> {

    Map<K, List<V>> map = new HashMap<>();

    @Override
    public List<V> get(K key) {
        return map.get(key);
    }

    @Override
    public void put(K key, V value) {

        if (key==null||value==null) {
            System.out.println("Нет аргументов!");
            return;
        }

        if(map.containsKey(key)){
            map.get(key).add(value);
        } else {
            List<V> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
}
