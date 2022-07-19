package com.homeWorks.ten.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    static Scanner scanner;

    public static void printMainMenu() {
        System.out.println("Main menu");
        System.out.println("1.List of customer information");
        System.out.println("2.New customer registration");
        System.out.println("3.Exit");
    }

    public static void printTheRequestToEnterTheNumber() {
        System.out.println("Please enter one of the above options : ");
    }

    public static int numberScanner() {
        int selection;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                selection = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please just enter number");
            }
        }
        return selection;
    }

    public static int selectMainMenu() {
        int selection = 0;
        while (selection < 1 || selection > 3) {
            selection = numberScanner();
            if (selection < 1 || selection > 3) {
                printTheRequestToEnterTheNumber();
            }
        }
        return selection;
    }

    public static String stringScannerService() {
        String selection = "";
        while (selection.isEmpty()) {
            scanner = new Scanner(System.in);
            selection = scanner.next();
            if (!(selection.equals("Dinner") || selection.equals("Conference") || selection.equals("Room"))) {
                System.out.println("Please enter only one of the above services : Dinner or Conference or Room");
                while (!(selection.equals("Dinner") || selection.equals("Conference") || selection.equals("Room"))) {
                    scanner = new Scanner(System.in);
                    selection = scanner.next();
                }
            }
        }
        return selection;
    }

    public static String stringScannerMain() {
        String selection = "";
        while (selection.isEmpty()) {
            scanner = new Scanner(System.in);
            selection = scanner.nextLine();
        }
        return selection;
    }

}
