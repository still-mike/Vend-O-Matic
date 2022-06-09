package com.techelevator.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class VendingMachine {
    private int availableFunds; //derived
    private Map<String, Object> inventoryMap;
    private int customerChange; //derived


    public VendingMachine(Map<String,Object> inventoryMap, int availableFunds, int customerChange) {
        this.inventoryMap = inventoryMap;
        this.availableFunds = 0;
        this.customerChange = 0;
    }

    public Map<String, Object> getInventoryMap() throws FileNotFoundException {
        inventoryMap = loadInventory();
        return inventoryMap;
    }

    public int addFunds(int funds){
        availableFunds += funds;
        return availableFunds;
    }

    public List<Item> makePurchase() {
        List<Item> purchased = new ArrayList<>();
    }


    private Map<String, Object> loadInventory() throws FileNotFoundException {

        String filePath = "C:\\Users\\Student\\workspace\\mod-1-capstone-java-team-1\\vendingmachine.csv";
        File inputFile = new File(filePath);

        Map<String, Object> inventoryMap = new TreeMap<>();


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









