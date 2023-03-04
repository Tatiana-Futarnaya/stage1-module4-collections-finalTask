package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list=new ArrayList<>();
        for (Map.Entry<String,Set<String>> item: projects.entrySet()) {
            for (String value: item.getValue()) {
                if(developer.equals(value)){
                    list.add(item.getKey());
                }
            }
        }
        Collections.sort(list,new ListComparator());
        return list;
    }
}

class ListComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int result=0;
        if(o1.length()<o2.length()){
            result=1;
        }

        return result;
    }
}
