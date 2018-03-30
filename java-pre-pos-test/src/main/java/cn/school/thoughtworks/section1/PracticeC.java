package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。

        List<String> collections = new ArrayList<>();
        for(String c1 :collection1){
            if(collection2.get("value").contains(c1)){
                collections.add(c1);
            }
        }
        return collections;
    }
}
