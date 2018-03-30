package cn.school.thoughtworks.section2;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection11) {
        List<String> collection1= new CopyOnWriteArrayList<>(collection11);
        Map<String, Integer> collections = new HashMap<>();

        specialCharacterToSignal(collection1);
        for (String c : collection1) {
            Integer count = Collections.frequency(collection1, c);
            collections.put(c, count);
        }
        return collections;
    }

    private void specialCharacterToSignal(List<String> collection1){
        for (String c : collection1) {
            if (c.length() > 1) {
                String word = c.replaceAll("[\\d\\p{P}]", "");
                String counts = c.replaceAll("[a-z\\p{P}]", "");
                Integer count = Integer.valueOf(counts);

                //递归删除
                for (Iterator<String> it = collection1.iterator(); it.hasNext();) {
                    String val = it.next();
                    if (val.equals(c)) {
                        collection1.remove(c);
                    }
                }

                for (int i = 0; i < count; i++) {
                    collection1.add(word);
                }
            }
        }
    }

}
