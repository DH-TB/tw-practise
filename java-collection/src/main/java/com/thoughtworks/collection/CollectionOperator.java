package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int i;
        List<Integer> resultList = new ArrayList<>();
        if (left < right) {
            for (i = left; i <= right; i++) {
                resultList.add(i);
            }
        } else {
            for (i = left; i >= right; i--) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int i;
        List<Integer> resultList = new ArrayList<>();
        if (left < right) {
            for (i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    resultList.add(i);
                }
            }
        } else {
            for (i = left; i >= right; i--) {
                if (i % 2 == 0) {
                    resultList.add(i);
                }
            }
        }
        return resultList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> resultList = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {

        List<Integer> resultList = new ArrayList<>();
        for (int i : firstArray) {
            if (IntStream.of(secondArray).anyMatch(x -> x == i)) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result = Arrays.asList(firstArray);
        List<Integer> resultList = new ArrayList<>();
        resultList.addAll(result);
        resultList.addAll(Arrays.stream(secondArray).filter(i->!result.contains(i)).collect(Collectors.toList()));
        return resultList;
    }
}
