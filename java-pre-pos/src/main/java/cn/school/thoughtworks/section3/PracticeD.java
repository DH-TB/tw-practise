package cn.school.thoughtworks.section3;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collections = new HashMap<>();

        for (String c :collectionA) {
            Integer count = Collections.frequency(collectionA,c);
            if(c.contains("-")){
                String[] splitArray = c.split("-");
                c =splitArray[0];
                count=Integer.valueOf(splitArray[1]);
            }
            collections.put(c,count);
        }

        Map<String, Integer> result = new HashMap<>();

        List<String> collections1 = object.get("value");
        for (String c : collections1) {

            Integer num = collections.get(c);
            collections.put(c, num-num/3);
        }
        return collections;
    }



}
