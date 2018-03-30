package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
//        Map<String, Integer> collections = new HashMap<>();
//        for (String c :collection1){
//          if(collections.get(c) == null){
//              collections.put(c,1);
//          }
//          else {
//              Integer num = collections.get(c)+1;
//              collections.remove(c);
//              collections.put(c,num);
//          }
//        }



        Map<String, Integer> collections = new HashMap<>();
        for (String c :collection1) {
            Integer count = Collections.frequency(collection1,c);
            collections.put(c,count);
        }
        return collections;
    }
}
