package com.thoughtworks.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
    }

    public double getMinimum() {
        return arrayList.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMin();
    }

    public double getAverage() {
        return arrayList.stream().collect(Collectors.summarizingInt(Integer::intValue)).getAverage();
    }

    public double getOrderedMedian() {
        int length = arrayList.size();
        if (length % 2 == 0) {
            return (arrayList.get(length / 2) + arrayList.get(length / 2 - 1)) / 2.0;
        } else {
            return arrayList.get(length / 2);
        }
    }

    public int getFirstEven() {
        return arrayList.stream().filter(i -> (i % 2) == 0).findFirst().orElse(-1);
    }

    public int getIndexOfFirstEven() {
        return arrayList.stream().map((Integer i) -> {
            if (i % 2 == 0) {
                return arrayList.indexOf(i);
            } else {
                return -1;
            }
        }).filter(i -> i != -1).findFirst().orElse(-1);
    }

    public int getLastOdd() {
        Collections.reverse(arrayList);
        return arrayList.stream().filter(i -> (i % 2) == 1).findFirst().orElse(-1);
    }

    public int getIndexOfLastOdd() {
        return arrayList.stream().map(i -> i % 2 == 1).collect(Collectors.toList()).size() - 1;
    }

    public boolean isEqual(List<Integer> List) {
        if(List.size() != arrayList.size()){
            return false;
        }
        List = new ArrayList<>(List);
        arrayList = new ArrayList<>(arrayList);
        return arrayList.equals(List);
    }

    public double getMedianInLinkList(SingleLink<Integer> singleLink) {
        arrayList.stream().forEach(i -> singleLink.addTailPointer(i));
        int length = arrayList.size();
        if (length % 2 == 0) {
            return (singleLink.getNode(length / 2) + singleLink.getNode(length / 2 + 1)) / 2.0;
        } else {
            return singleLink.getNode(length / 2);
        }
    }


}
