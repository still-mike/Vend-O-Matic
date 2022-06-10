package com.techelevator.model;

public class MoneyBank {

    public double balance;

    public MoneyBank() {
        balance = 0;
    }

    public void receiveFunds(double amountDeposited) {

        balance += amountDeposited;

    }

    public void withdrawFunds(double amountWithdrawn) {

        balance -= amountWithdrawn;

    }

//    public void





}

// depositMoney

// keep track of how much money is in the machine
// receive input for whatever selection is made
// get cost of item selected
// subtract it from available funds
// keep track of new available funds total
//


// method to determine calculateChange