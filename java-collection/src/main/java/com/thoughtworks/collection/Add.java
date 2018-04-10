package com.thoughtworks.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int i, sum = 0;
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int i, sum = 0;
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().reduce(0, (a, b) -> a + b * 3 + 2);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List result = new ArrayList();
        for (Integer i : arrayList) {
            if (i % 2 == 1) {
                result.add(i * 3 + 2);
            } else {
                result.add(i);
            }
        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(i -> i % 2 == 1).reduce(0, (a, b) -> a + b * 3 + 5);
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        int middle, length = evenList.size();
        if (length % 2 == 0) {
            middle = (evenList.get(length / 2) + evenList.get(length / 2 - 1)) / 2;
        } else {
            middle = evenList.get(length / 2);
        }
        return middle;

    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        List<Integer> filterList = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        return filterList.stream().reduce(0, (a, b) -> a + b) / filterList.size();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        if (specialElment % 2 == 0) {
            return true;
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        Set<Integer> evenList = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
        return new ArrayList<>(evenList);
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream().filter(i -> i % 2 == 0).sorted().collect(Collectors.toList());
        List<Integer> oddList = arrayList.stream().filter(i -> i % 2 == 1).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        evenList.addAll(oddList);
        return evenList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            result.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return result;
    }
}
