package com.techelevator.model;

public class Gum extends Item {
    public Gum(String name, double price) {
        super(name, price);
    }

    @Override
    public String purchaseSound() {
        return "Chew Chew, Yum!";
    }
}
