package com.techelevator.model;

public abstract class Item {
   private int price;
   private String name;
   private int count;

   public Item(String name, double price) {
       this.price = (int)(price * 100);
       this.name = name;
       this.count = 5;
   }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public int reduceCount() {
       return --count;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%-20.20s $%.2f", name, price / 100.0);
   }

   public abstract String purchaseSound();






}
