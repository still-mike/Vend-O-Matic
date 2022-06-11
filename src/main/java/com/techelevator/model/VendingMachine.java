package com.techelevator.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class VendingMachine {
    private int availableFunds; //derived
    private Map<String, Item> inventoryMap;
    private int customerChange; //derived


    public VendingMachine() throws FileNotFoundException {
        inventoryMap = loadInventory();
    }

    public Map<String, Item> getInventoryMap() throws FileNotFoundException {

        return inventoryMap;
    }

    public int addFunds(int funds) {
        availableFunds += funds;
        return availableFunds;
    }

    public int getAvailableFunds() {
        return availableFunds;
    }

    public Item makePurchase(String slotIdentifier) throws InvalidIdentifierException, SoldOutException, InsufficientFundsException {
        // contains key on the map
        if (!inventoryMap.containsKey(slotIdentifier)) {
            throw new InvalidIdentifierException("This item is invalid: " + slotIdentifier);
        }
        // if it doesn't contain key, throw an invalid identifier exception
//
        Item purchasedItem = inventoryMap.get(slotIdentifier);
        if (purchasedItem.getCount() == 0) {
            throw new SoldOutException("This item is sold out: " + slotIdentifier );
            //sold out, throw sold out exception
        }
        // if available funds is less than purchasedItem price
        // if it's less than, throw not enough funds exception

        if (availableFunds < purchasedItem.getPrice()) {
            throw new InsufficientFundsException("Insufficient funds available to purchase item: " + slotIdentifier);
        }

        purchasedItem.reduceCount();

        availableFunds -= purchasedItem.getPrice();


        return purchasedItem;
    }


    private Map<String, Item> loadInventory() throws FileNotFoundException {

        String filePath = "C:\\Users\\Student\\workspace\\mod-1-capstone-java-team-1\\vendingmachine.csv";
        File inputFile = new File(filePath);

        Map<String, Item> inventoryMap = new TreeMap<>();


        try (Scanner fileScanner = new Scanner(inputFile)) {
            int lineNumber = 1;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\|");


                if (parts[3].equals("Chip")) {
                    Item chip = new Chip(parts[1], Double.parseDouble(parts[2]));
                    inventoryMap.put(parts[0], chip);


                } else if (parts[3].equals("Gum")) {
                    Item gum = new Gum(parts[1], Double.parseDouble(parts[2]));
                    inventoryMap.put(parts[0], gum);


                } else if (parts[3].equals("Candy")) {
                    Item candy = new Candy(parts[1], Double.parseDouble(parts[2]));
                    inventoryMap.put(parts[0], candy);

                } else if (parts[3].equals("Beverage")) {
                    Item beverage = new Beverage(parts[1], Double.parseDouble(parts[2]));
                    inventoryMap.put(parts[0], beverage);


                }
                lineNumber++;
            }
            return inventoryMap;

        }


    }
}









