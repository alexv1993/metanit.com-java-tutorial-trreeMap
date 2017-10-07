package com.github.alexv1993;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Alex on 08.10.2017.
 */
public interface CollectionApp<K, V> {
    public void printTreeMap(Map<K, V> map);

    public Set<K> getKeys(Map<K, V> map);

    public Collection<V> getValues(Map<K, V> map);

    public Map<K, V> getAfterMap(TreeMap<K, V> map, K key);

    public Map<K, V> getBeforeMap(TreeMap<K, V> map, K key);

    public Map.Entry<K, V> getLastElm(TreeMap<K, V> map);


}
