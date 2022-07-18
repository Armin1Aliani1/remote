package com.homeWorks.nine;

import java.util.function.Predicate;

public class FirstAndLastLetterOfWord {
    public static void main(String[] args) {
        Predicate<String> equalFirstAndLastLetterCheck =
                w -> w.substring(0, 1).equals(w.substring(w.length() - 1));
        if (equalFirstAndLastLetterCheck.test("abcdcc")) {
            System.out.println("hrf avl va akhar yeki ast");
        } else System.out.println("harf avl va akhar yeki nist");
    }
}
