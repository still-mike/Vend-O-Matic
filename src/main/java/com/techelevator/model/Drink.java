package com.techelevator.model;

public class Drink extends Item {


    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public String purchaseSound() {
        return "Glug Glug, Yum!";
    }
}
