package com.techelevator.model;

public class Chip extends Item{
    public Chip(String name, double price) {
        super(name, price);
    }

    @Override
    public String purchaseSound() {
        return "Crunch Crunch, Yum!";
    }
}
