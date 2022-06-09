package com.techelevator.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    private int availableFunds; //derived
    private Map<String, Object> inventoryMap;
    private int amountDeposited;
    private int customerChange; //derived


    public Map<String, Object> getInventoryMap() {


        return inventoryMap;
    }

    private Map<String, Object> loadInventory() throws FileNotFoundException {

        String filePath = "C:\\Users\\Student\\workspace\\mod-1-capstone-java-team-1\\vendingmachine.csv";
        File inputFile = new File(filePath);

        Map<String, Object> inventoryMap = new HashMap<>();


        try (Scanner fileScanner = new Scanner(inputFile)) {
            int lineNumber = 1;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\|");


                if (parts[3].equals("Chip")) {
                    Item item = new Chip(parts[1], Integer.parseInt(parts[2]), parts[3]);
                    inventoryMap.put(parts[0], item);


                } else if (parts[3].equals("Gum")) {
                    Item item = new Gum(parts[1], Integer.parseInt(parts[2]), parts[3]);
                    inventoryMap.put(parts[0], item);


                } else if (parts[3].equals("Candy")) {
                    Item item = new Candy(parts[1], Integer.parseInt(parts[2]), parts[3]);
                    inventoryMap.put(parts[0], item);

                } else if (parts[3].equals("Beverage")) {
                    Item item = new Beverage(parts[1], Integer.parseInt(parts[2]), parts[3]);
                    inventoryMap.put(parts[0], item);


                }
                lineNumber++;
            }
            return inventoryMap;

        }
    }
}









