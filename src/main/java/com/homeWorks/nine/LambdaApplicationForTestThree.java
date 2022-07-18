package com.homeWorks.nine;

import java.util.Scanner;
import java.util.function.BiFunction;

public class LambdaApplicationForTestThree {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BiFunction<Float, Float, Float> average = (x, y) -> {
            return (x + y) / 2;
        };
        System.out.println("Please enter a first number for average : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter a second number for average : ");
        int secondNumber = scanner.nextInt();
        System.out.println(average.apply((float) firstNumber, (float) secondNumber));
    }
}
