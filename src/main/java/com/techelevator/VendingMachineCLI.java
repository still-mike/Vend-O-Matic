package com.techelevator;

import com.techelevator.model.VendingMachine;
import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.util.Map;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };

	private Menu menu;

	private VendingMachine vendingMachine;





	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() throws FileNotFoundException {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			VendingMachine vendingMachine  = new VendingMachine();
			// (1) Display Vending Machine Items
			// (2) Purchase
			// (3) Exit

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				Map<String, Object> inventoryMap = vendingMachine.getInventoryMap();
				System.out.println(inventoryMap);

						for (Map.Entry <String, Object> entry : inventoryMap.entrySet()) {
							System.out.println(entry.getKey() + ": " + entry.getValue().toString());
						}

				// display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}


}
