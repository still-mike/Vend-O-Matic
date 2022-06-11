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