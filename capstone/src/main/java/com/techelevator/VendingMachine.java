package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class VendingMachine {
	
	private Inventory inventory = new Inventory();
	
	private Bank bank = new Bank();
	
	public void getSelection() {
		@SuppressWarnings("resource")
		Scanner customerSelection = new Scanner(System.in);
		System.out.println("Please select the slot id for the product you want: ");
		String selection = customerSelection.nextLine();
		
		Product customerProduct = inventory.findProduct(selection.toUpperCase());
		int newQuantity = customerProduct.getQuantity()-1;
			customerProduct.setQuantity(newQuantity);
			System.out.println(customerProduct.getName()+ " " + customerProduct.getPrice());
		}
	


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
