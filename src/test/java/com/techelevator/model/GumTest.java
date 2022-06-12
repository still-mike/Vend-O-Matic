package com.techelevator.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class GumTest {

    @Test
    public void getPrice() {
        Gum gum = new Gum("juicy fruit", 2.00);
        int actual = gum.getPrice();
        assertEquals(200, actual);

    }

    @Test
    public void getCount() {
        Gum gum = new Gum("juicy fruit", 2.00);
        int count = gum.getCount();
        assertEquals(5, count);
    }

    @Test
    public void reduceCount() {
        Gum gum = new Gum("juicy fruit", 2.00);
        int count = gum.getCount();
        assertEquals(5, count);
        count = gum.reduceCount();
        assertEquals(4, count);
    }

    @Test
    public void getName() {
        Gum gum = new Gum("juicy fruit", 2.00);
        String name = gum.getName();
        assertEquals("juicy fruit", name);
    }

    @Test
    public void purchaseSound() {
        Gum gum = new Gum("juicy fruit", 2.00);
        String sound = gum.purchaseSound();
        assertEquals("Chew Chew, Yum!", sound);
    }
}