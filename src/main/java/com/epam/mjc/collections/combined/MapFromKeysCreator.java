package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> myMap = new HashMap<>();
        Set<String> mySet = new HashSet<>();
        for(var e : sourceMap.entrySet()){
            mySet.add(e.getKey());
            int a = e.getKey().length();
            for(var q : sourceMap.entrySet()){
                if(q.getKey().length() == a)
                    mySet.add(q.getKey());
            }
            myMap.put(a, new HashSet<>(Set.copyOf(mySet)));
            mySet.clear();
        }
        return myMap;
    }
}
