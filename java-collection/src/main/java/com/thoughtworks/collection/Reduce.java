package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.OptionalInt;
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
        throw new NotImplementedException();
    }

    public int getFirstEven() {
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        return arrayList.stream().equals(this.arrayList);
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }


}
