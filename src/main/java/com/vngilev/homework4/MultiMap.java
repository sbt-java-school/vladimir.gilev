package com.vngilev.homework4;
import java.util.List;

public interface MultiMap<K,V> {
    List<V> get(K key);
    void put(K key, V value);
}
