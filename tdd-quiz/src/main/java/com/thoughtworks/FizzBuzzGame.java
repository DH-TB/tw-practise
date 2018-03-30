package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            String result = sayNumber(i);
            results.add(result);
        }
    }

    String sayNumber(int number) {
        String word = "";
        String num = String.valueOf(number);
        if (num.contains("3")) {
            return "Fizz";
        }
        word += threeMultiple(number) + fiveMultiple(number) + sevenMultiple(number);
        if (word.equals("")) {
            return num;
        }
        return word;
    }


    public String threeMultiple(int i) {
        return i % 3 == 0 ? "Fizz" : "";
    }

    public String fiveMultiple(int i) {
        return i % 5 == 0 ? "Buzz" : "";
    }

    public String sevenMultiple(int i) {
        return i % 7 == 0 ? "Whizz" : "";
    }

    public List<String> getResults() {
        return results;
    }
}


