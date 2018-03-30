package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {

        Map<String, Integer> collections = new HashMap<>();
        for (String c :collection1) {
            Integer count = Collections.frequency(collection1,c);
            if(c.contains("-")){
                String[] splitArray = c.split("-");
                c =splitArray[0];
                count=Integer.valueOf(splitArray[1]);
            }
            collections.put(c,count);
        }
        return collections;
    }
}
