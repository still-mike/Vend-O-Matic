package com.techelevator.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrinkTest {

    @Test
    public void getPrice() {
        Drink drink = new Drink("Yoo-hoo", 1.75);
        int actual = drink.getPrice();
        assertEquals(175, actual);
    }

    @Test
    public void getCount() {
        Drink drink = new Drink("Yoo-hoo", 1.75);
        int count = drink.getCount();
        assertEquals(5, count);
    }

    @Test
    public void reduceCount() {
        Drink drink = new Drink("Yoo-hoo", 1.75);
        int count = drink.getCount();
        assertEquals(5, count);
        count = drink.reduceCount();
        assertEquals(4, count);
    }

    @Test
    public void getName() {
        Drink drink = new Drink("Yoo-hoo", 1.75);
        String name = drink.getName();
        assertEquals("Yoo-hoo", name);
    }

    @Test
    public void purchaseSound() {
        Drink drink = new Drink("Yoo-hoo", 1.75);
        String purchaseSound = drink.purchaseSound();
        assertEquals("Glug Glug, Yum!", purchaseSound);
    }


}