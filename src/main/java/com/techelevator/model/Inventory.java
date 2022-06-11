package com.techelevator.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory {

    Map<Item, Integer> inventoryList = new TreeMap<>();

    String fileString = "vendingmachine.csv";
    File inventoryFile = new File(fileString);
    Scanner fileScanner = new Scanner(inventoryFile);


    public Inventory() throws FileNotFoundException {

    }


}

//    String filePath = "C:\\Users\\Student\\workspace\\mod-1-capstone-java-team-1\\vendingmachine.csv";
//    File inputFile = new File(filePath);

//try (Scanner fileScanner = new Scanner(inputFile)) {
//        int lineNumber = 1;
//        while (fileScanner.hasNextLine()) {
//        String line = fileScanner.nextLine();
//        String[] parts = line.split("\\|");

// start inventory for each item at 5

// decrease individual quantity when customer purchases an item

// reset quantity to default when vending machine starts again