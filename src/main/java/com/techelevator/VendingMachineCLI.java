package com.techelevator;

import com.techelevator.model.Item;
import com.techelevator.model.VendingMachine;
import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.util.Map;

public class VendingMachineCLI {

    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};
    private static final String SUB_MENU_OPTION_1 = "Feed Money";
    private static final String SUB_MENU_OPTION_2 = "Select Product ";
    private static final String SUB_MENU_OPTION_3 = "Finish Transaction";
    private static final String[] SUB_MENU_OPTIONS = {SUB_MENU_OPTION_1, SUB_MENU_OPTION_2, SUB_MENU_OPTION_3};


    private Menu menu;

    private VendingMachine vendingMachine;


    public VendingMachineCLI(Menu menu) {
        this.menu = menu;
    }


    public void run() throws FileNotFoundException {
        boolean running = true;
        while (running) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
            VendingMachine vendingMachine = new VendingMachine();
            // (1) Display Vending Machine Items
            // (2) Purchase
            // (3) Exit

            if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
                Map<String, Item> inventoryMap = vendingMachine.getInventoryMap();


                for (Map.Entry<String, Item> entry : inventoryMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue().toString());
                }

                // display vending machine items
            } else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
                boolean subRunning = true;
                while (subRunning) {
                    choice = (String) menu.getChoiceFromOptions(SUB_MENU_OPTIONS);

                    if (choice.equals(SUB_MENU_OPTION_1)) {
                        int currentBalance = funds


                        // what happens when customer feeds money?
                        //"Current Money Provided?" - will be updated as money is fed in
                    }

//                    } else (choice.equals(SUB_MENU_OPTION_2)) {


//                } else (choice.equals(SUB_MENU_OPTION_3)) {

                }

                // do purchase
                // nesting our makepurchase sub menu here


            } else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
                running = false;
            }
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu(System.in, System.out);
        VendingMachineCLI cli = new VendingMachineCLI(menu);
        cli.run();
    }
// try catch block instead of exception

}

