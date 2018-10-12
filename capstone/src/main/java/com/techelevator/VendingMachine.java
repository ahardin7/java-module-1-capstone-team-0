package com.techelevator;

public class VendingMachine {
	
	private Inventory inventory = new Inventory();
	
	private Bank bank = new Bank();
	
	public Bank getBank() {
		return bank;
	}

	public void boot() throws Exception {
		inventory.stock();
	}
	
    public Inventory getInventory() {
    	return inventory;
    }
}
