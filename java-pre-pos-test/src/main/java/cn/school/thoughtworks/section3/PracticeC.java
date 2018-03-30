package cn.school.thoughtworks.section3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> collection1 = new HashMap<>();
        for (String c :collectionA) {
            Integer count = Collections.frequency(collectionA,c);
            collection1.put(c,count);
        }

        List<String> collections = object.get("value");
        for (String c : collections) {
            Integer num = collection1.get(c);
            if (num != null) {
                collection1.remove(c);
                Integer count = num/3;
                collection1.put(c, num - count);
            }
        }
        return collection1;
    }
}
