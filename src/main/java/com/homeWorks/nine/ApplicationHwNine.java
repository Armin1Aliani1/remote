package com.homeWorks.nine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class ApplicationHwNine {
    public static void main(String[] args) {
        System.out.println("For an array of strings, this program sorts the words by their number of letters");

        List<String> word = new ArrayList<>();
        word.add("aaaaa");
        word.add("bbbbb");
        word.add("cccc");
        word.add("dddd");
        word.add("eee");

        Map<Integer, List<String>> integerListMap = word.stream().collect(groupingBy(String::length));
        integerListMap.forEach((a, b) -> System.out.println(a + "" + b + b.size()));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(1);
//        arrayList.stream().filter(num->num>1).forEach(num-> System.out.println(num));
        arrayList.stream().filter(num -> num > 1).forEach(System.out::println);

    }
}
