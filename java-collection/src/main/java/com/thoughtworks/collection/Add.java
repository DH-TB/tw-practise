package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

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
        int sum = 0;
        for (Integer i : arrayList) {
            sum = sum + (i * 3 + 2);
        }
        return sum;
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
        int sum = 0;

        for (Integer i : arrayList) {
            if (i % 2 == 1) {
                sum = sum + (i * 3 + 5);
            }
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        int middle, length = evenList.size();
        if (length % 2 == 0) {
            middle = (evenList.get(length / 2) + evenList.get(length / 2 - 1)) / 2;
        } else {
            middle = evenList.get(length / 2);
        }
        return middle;

    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int length = 0, sum = 0;
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                sum += i;
                length++;
            }
        }
        return sum / length;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        if (specialElment % 2 == 0) {
            return true;
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        HashSet<Integer> evenList = new HashSet<>();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        List<Integer> resultList = new ArrayList<>(evenList);
        return resultList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());
        for (Integer i : evenList) {
            resultList.add(i);
        }
        for (Integer i : oddList) {
            resultList.add(i);
        }
        return resultList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            result.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return result;
    }
}
