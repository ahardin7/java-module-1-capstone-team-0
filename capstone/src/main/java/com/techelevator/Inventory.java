package com.techelevator;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {

	Map<String, Product> inventory = new HashMap<>();

	public void stock() throws Exception {

		File newFile = new File("/Users/abigailruminas/workspace/m1-java-capstone-vending-machine",
				"vendingmachine.csv");

		try (Scanner fileReader = new Scanner(newFile)) {

			while (fileReader.hasNextLine()) {
				String currentLine = fileReader.nextLine();
				String[] itemArray = currentLine.split("|");
				String slotId = itemArray[0];
				String name = itemArray[1];
				BigDecimal price =new BigDecimal(itemArray[2]);
				String type = itemArray[3];
				Product item = new Product(type, name, price, 5);
				inventory.put(slotId, item);
				

			}

		}

	}
}

/*
 * public String itemName; public double itemPrice; public int itemQuantity;
 * public String itemLocation;
 * 
 * public Inventory(String itemName, double itemPrice, int itemQuantity, String
 * itemLocation) {
 * 
 * 
 * this.itemName = itemName; this.itemPrice = itemPrice; this.itemQuantity =
 * itemQuantity; this.itemLocation = itemLocation; }
 * 
 * Inventory chips = new Inventory("potato chips", 1.50, 5, "A1"); Inventory
 * chips2 = new Inventory("pita chips", 2.00, 5, "A2"); Inventory chips3 = new
 * Inventory("pretzel chips", 1.00, 5, "A3"); Inventory candy = new
 * Inventory("crunch", 1.00, 5, "B1"); Inventory candy2 = new
 * Inventory("kitkat", 1.50, 5, "B2"); Inventory candy3 = new
 * Inventory("hershey", 1.25, 5, "B3"); Inventory gum = new
 * Inventory("doublebubble", .50, 5, "C1"); Inventory gum2 = new
 * Inventory("bigred", .50, 5, "C2"); Inventory gum3 = new Inventory("wriglys",
 * .50, 5, "C3"); Inventory drinks = new Inventory("coke", 1.50, 5, "D1");
 * Inventory drinks2 = new Inventory("water", 1.00, 5, "D2"); Inventory drinks3
 * = new Inventory("ice tea", 1.75, 5, "D3"); //List<Inventory> listOfItems =
 * new ArrayList<>();
 * 
 */
