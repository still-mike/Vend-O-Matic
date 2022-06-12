package com.techelevator.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {

    @Test
    public void getPrice() {
        Candy candy = new Candy("Circus Peanuts", 8.99);
        int actual = candy.getPrice();
        assertEquals(899, actual);
    }

    @Test
    public void getCount() {
        Candy candy = new Candy("Circus Peanuts", 8.99);
        int count = candy.getCount();
        assertEquals(5, count);
    }

    @Test
    public void reduceCount() {
        Candy candy = new Candy("Circus Peanuts", 8.99);
        int count = candy.getCount();
        assertEquals(5, count);
        count = candy.reduceCount();
        assertEquals(4, count);
    }

    @Test
    public void getName() {
        Candy candy = new Candy("Circus Peanuts", 8.99);
        String name = candy.getName();
        assertEquals("Circus Peanuts", name);
    }

    @Test
    public void purchaseSound() {
        Candy candy = new Candy("Circus Peanuts", 8.99);
        String purchaseSound = candy.purchaseSound();
        assertEquals("Munch Munch, Yum!", purchaseSound);
    }
}