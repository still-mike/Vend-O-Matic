package com.techelevator.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChipTest {

    @Test
    public void getPrice() {
        Chip chip = new Chip("Smartfood White Cheddar Popcorn", 1.50);
        int actual = chip.getPrice();
        assertEquals(150, actual);
    }

    @Test
    public void getCount() {
        Chip chip = new Chip("Smartfood White Cheddar Popcorn", 1.50);
        int count = chip.getCount();
        assertEquals(5, count);
    }

    @Test
    public void reduceCount() {
        Chip chip = new Chip("Smartfood White Cheddar Popcorn", 1.50);
        int count = chip.getCount();
        assertEquals(5, count);
        count = chip.reduceCount();
        assertEquals(4, count);
    }

    @Test
    public void getName() {
        Chip chip = new Chip("Smartfood White Cheddar Popcorn", 1.50);
        String name = chip.getName();
        assertEquals("Smartfood White Cheddar Popcorn", name);
    }

    @Test
    public void purchaseSound() {
        Chip chip = new Chip("Smartfood White Cheddar Popcorn", 1.50);
        String purchaseSound = chip.purchaseSound();
        assertEquals("Crunch Crunch, Yum!", purchaseSound);
    }
}