package com.techelevator.model;

public class Candy extends Item{
    public Candy(String name, double price) {
        super(name, price);
    }

    @Override
    public String purchaseSound() {
        return "Munch Munch, Yum!";
    }
}
