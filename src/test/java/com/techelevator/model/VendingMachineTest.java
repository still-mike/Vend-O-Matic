package com.techelevator.model;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    public void getInventoryMap() {
    }

    @Test
    public void addFunds() {
        // Arrange - arranging conditions of the test - setting up test data
//        int theFunds = 3;
//        int correctAmountFunds = theFunds.get


        // Act - perform the action of interest - the thing you're testing


        // Assert - validate that the expected outcome occurred by means of an assertion - a certain value was returned, or a file exists.

        //availableFunds += funds * 100;
        //        return availableFunds;
        //    }


    }

    @Test
    public void makePurchase() throws FileNotFoundException, InvalidIdentifierException, InsufficientFundsException, SoldOutException {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addFunds(1000);
        Item item = vendingMachine.makePurchase("A1");
        // A1|Potato Crisps|3.05|Chip
        assertEquals("Potato Crisps", item.getName());
        assertEquals(305, item.getPrice());
        assertEquals(4, item.getCount());
        item = vendingMachine.makePurchase("A1");
        assertEquals(3, item.getCount());
        assertEquals(390, vendingMachine.getAvailableFunds());


    }

    @Test(expected = InvalidIdentifierException.class)
    public void makePurchase_InvalidID() throws FileNotFoundException, InvalidIdentifierException, InsufficientFundsException, SoldOutException {
        VendingMachine vendingMachine = new VendingMachine();
        Item item = vendingMachine.makePurchase("M1");

    }

}