package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> map=new HashMap<>();
        Set<String> set=new HashSet<>();

        for (Map.Entry<String,Integer> item: sourceMap.entrySet()) {
            int x = item.getKey().length();
            set.add(item.getKey());
            map.put(x, null);



            for (Map.Entry<Integer, Set<String>> value : map.entrySet()) {
                value.setValue(new HashSet<>());
                for (String i: set) {
                    if(value.getKey()==i.length()){
                        value.getValue().add(i);
                    }
                }


            }
        }
        return map;
    }
}
