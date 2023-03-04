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
        Comparator c=Collections.reverseOrder();
        Collections.sort(list,c);
        String tmp=null;
        for (int i=1; i<list.size();i++){
            if(list.get(i-1).length()<list.get(i).length()){
                tmp=list.get(i-1);
                list.set(i-1,list.get(i));
                list.set(i,tmp);
            }
        }
        return list;
    }
}

