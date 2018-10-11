package com.techelevator;

public class VendingMachine {
	
	private Inventory inventory = new Inventory();
	
	public void boot() throws Exception {
		inventory.stock();
	}
	
    public Inventory getInventory() {
    	return inventory;
    }
}
