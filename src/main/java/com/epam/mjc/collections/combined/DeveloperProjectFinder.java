package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> myList = new ArrayList<>();
        for(var e : projects.entrySet()){
            for(var value : e.getValue()){
                if(value.equals(developer))
                    myList.add(e.getKey());
            }
        }

        String a;
        for(int i = 0; i < myList.size()-1; i++){
            for(int j = 0; j< myList.size()-1; j++){
                if(myList.get(j).length() < myList.get(j+1).length()){
                    a = myList.get(j);
                    myList.set(j, myList.get(j+1));
                    myList.set(j+1, a);
                }
            }
        }

        return myList;
    }
}
