package com.homeWorks.ten;

import com.homeWorks.ten.domain.Costumer;
import com.homeWorks.ten.util.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ApplicationHotel {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        startApplication();

    }

    private static void startApplication() throws IOException {
        Menu.printMainMenu();
        Menu.printTheRequestToEnterTheNumber();
        int selection = Menu.selectMainMenu();

        if (selection == 1) {
            readOfOnFile();
        } else if (selection == 2) {
            writeOnFile();
        } else {
            System.exit(selection);
        }
    }

    private static void readOfOnFile() throws FileNotFoundException {

        File file = new File("hotelCustomerInformation.txt");

        // This is try with resources in java
        // You can use (try with resources) for classes that have autocloseable
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        // You can use (try with resources) for classes that have autocloseable
        // This is try with resources in java

    }

    private static void writeOnFile() throws IOException {

        File file = new File("hotelCustomerInformation.txt");

        System.out.println("Customer Full Name : ");
        String fullName = Menu.stringScannerMain();
        System.out.println("Please enter only one of the above services : Dinner or Conference or Room");
        System.out.println("Customer Service : ");
        String service = Menu.stringScannerService();
        System.out.println("Amount : ");
        int amount = Menu.numberScanner();

        Costumer costumer = new Costumer();
        costumer.setFullName(fullName);
        costumer.setService(service);
        costumer.setAmount(amount);

//        Costumer costumer = new Costumer(fullName,service,amount);

        // In order to be able to add text to the file, we use (true)
        FileWriter fileWriter = new FileWriter(file, true);
        // In order to be able to add text to the file, we use (true)

        fileWriter.write("\n" + costumer.getFullName() + " ----------| " + costumer.getService() + " ----------| " + costumer.getAmount() + "$");

        fileWriter.close();

        startApplication();

    }

}
