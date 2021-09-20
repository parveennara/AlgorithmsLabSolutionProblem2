package com.greatlearning.service;

public class CheckDenominations {

	public void checkPayment(int[] denominations, int amount) {
		
		int[] counter = new int[denominations.length];
		
		try {
			
			for (int i = 0; i < denominations.length; i++) {
				
				if (amount >= denominations[i]) {
					
					counter[i] = amount / denominations[i];
					amount = amount - counter[i] * denominations[i];
				}
			}
			if (amount > 0) {
				
				System.out.println("Exact amount cannot be given with the denominations");
			} else {
				
				System.out.println("Your payment approach in order to give min no of notes will be");
				
				for (int j = 0; j < denominations.length; j++) {
					
					if (counter[j] != 0) {
						
						System.out.println(denominations[j] + ":" + counter[j]);
					}
				}
			}
			
		} catch(ArithmeticException e) {
			
			System.out.println(e + " Invalid currency denomination 0");
			} 
		
	}

}
