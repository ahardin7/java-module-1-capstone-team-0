package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {

	private BigDecimal balance = new BigDecimal("0.00");

	public void getMoney() {

		Scanner customerInput = new Scanner(System.in);

		while (true) {
			System.out.println("Please enter $: 1, 2, 5 or 10)");

			BigDecimal cashIn = customerInput.nextBigDecimal();
			customerInput.nextLine();

			System.out.println("cashIn = " + cashIn);

			if (cashIn.equals(new BigDecimal(1)) || cashIn.equals(new BigDecimal(2)) || cashIn.equals(new BigDecimal(5))
					|| cashIn.equals(new BigDecimal(10))) {
				balance = balance.add(cashIn);
				System.out.println("current balance: $" + balance.toString());
			} else {
				System.out.println("Invalid Input please enter 1,2,5 or 10");
			}
			System.out.println("Do you want to add more money? If so y for yes n for no");
			String customerWantsMore = customerInput.nextLine();

			if (customerWantsMore.toLowerCase().equals("n")) {
				break;
			}

		}

	}
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		balance = balance.subtract(amountToWithdraw);
			return balance;
	}
	public void change () {
		BigDecimal quarterValue = new BigDecimal("0.25");
		BigDecimal dimeValue = new BigDecimal("0.10");
		BigDecimal nickelValue = new BigDecimal("0.05");
		int numberOfDimes = 0;
		int numberOfQuarters = 0;
		int numberOfNickels = 0;
		while ((balance.compareTo(quarterValue) > -1)){
			balance = balance.subtract(quarterValue);
			numberOfQuarters = numberOfQuarters + 1;
		}
	    while ((balance.compareTo(dimeValue) > -1)) {
	    	balance = balance.subtract(dimeValue);
	    	numberOfDimes = numberOfDimes + 1;
	    }
	    while ((balance.compareTo(nickelValue) > -1)) {
	    	balance = balance.subtract(nickelValue);
	    	numberOfNickels = numberOfNickels + 1;
	    }
	    System.out.println("Your change is - " + numberOfQuarters + " Quarter(s), " + numberOfDimes + " Dime(s), and "
	            + numberOfNickels + " Nickel(s).");
	    
			
		}
		
	}

