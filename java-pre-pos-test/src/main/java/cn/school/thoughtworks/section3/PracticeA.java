package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> collections = object.get("value");
        for(String c:collections){
            Integer num = collectionA.get(c);
            if( num!= null){
                collectionA.remove(c);
                collectionA.put(c,num-1);
            }
        }
        return collectionA;
    }
}
