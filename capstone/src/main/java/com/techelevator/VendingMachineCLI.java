package com.techelevator;

import java.util.Map;

import com.techelevator.view.Menu;

public class VendingMachineCLI {
	

	private VendingMachine vm = new VendingMachine();
	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE,
			MAIN_MENU_OPTION_EXIT };

	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_COMPLETE_TRANSACTION = "Complete Transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT,
			PURCHASE_MENU_OPTION_COMPLETE_TRANSACTION };

	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		try {
			vm.boot();
			boolean shouldLoop = true;
			while (shouldLoop) {
				String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

				if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
					Inventory inventory = vm.getInventory();
					for(Map.Entry<String, Product> entry : inventory.getProducts().entrySet()) {
						Product p = (Product)entry.getValue();
						System.out.println(p.getSlotId() + " " + p.getName() + ": $" + p.getPrice() +  ", " + p.getQuantity());
					}
					// display vending machine items - good place for a method call
				} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
					// do purchase - good place for a method call
					boolean shouldLoopPurchase = true;
					while (shouldLoopPurchase) {
						String purchaseChoice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
						if (purchaseChoice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
							vm.getBank().getMoney();
						}
						else if (purchaseChoice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
							vm.getSelection();
							// This is where you prompt the user for the slotID, and then call vm.purchase(slotID)
						}
						else if (purchaseChoice.equals(PURCHASE_MENU_OPTION_COMPLETE_TRANSACTION)) {
							vm.getBank().change();
							// Return any change to user, and then leave the purchase menu loop
							shouldLoopPurchase = false;
						}
					}
				} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
					// do any end of program processing - good place for a method call
					shouldLoop = false;
				}
			}
		} catch (Exception ex) {
			System.out.println("Vending machine failed to boot: " + ex.getMessage());

		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
