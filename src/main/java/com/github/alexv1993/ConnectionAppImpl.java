package com.github.alexv1993;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Alex on 08.10.2017.
 */

public class ConnectionAppImpl<K, V> implements CollectionApp<K, V> {
    @Override
    public void printTreeMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }

    @Override
    public Set<K> getKeys(Map<K, V> map) {
        return map.keySet();
    }

    @Override
    public Collection<V> getValues(Map<K, V> map) {
        return map.values();
    }

    @Override
    public Map<K, V> getAfterMap(TreeMap<K, V> map, K key) {
        return map.tailMap(key);
    }

    @Override
    public Map<K, V> getBeforeMap(TreeMap<K, V> map, K key) {
        return map.headMap(key);
    }

    @Override
    public Map.Entry<K, V> getLastElm(TreeMap<K, V> map) {
        return map.lastEntry();
    }
}
