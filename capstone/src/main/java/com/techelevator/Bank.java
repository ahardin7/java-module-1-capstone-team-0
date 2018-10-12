package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {
	
	private BigDecimal balance = new BigDecimal ("0.00"); 
		
	public void getMoney() {
	
		Scanner customerInput = new Scanner(System.in);

		while(true) {
			System.out.println("Please enter $: 1, 2, 5 or 10)");
	
			BigDecimal cashIn = customerInput.nextBigDecimal();
			customerInput.nextLine();
		
			System.out.println("cashIn = "+ cashIn);
	
			if (cashIn.equals(new BigDecimal(1))  
			 || cashIn.equals(new BigDecimal(2))
			 || cashIn.equals(new BigDecimal(5))
			 || cashIn.equals(new BigDecimal(10))) {
				balance = balance.add(cashIn);
				System.out.println("current balance: " + balance.toString());
			}
			else {
				System.out.println("Invalid Input please enter 1,2,5 or 10");
			}
			System.out.println("Do you want to add more money? If so y for yes n for no");
			String customerWantsMore = customerInput.nextLine();
			
			if(customerWantsMore.toLowerCase().equals("n")) {
				break;
			}
	}				
}
}



