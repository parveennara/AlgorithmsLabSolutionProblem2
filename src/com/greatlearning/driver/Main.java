package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.CheckDenominations;
import com.greatlearning.service.MergeSort;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		
		int[] denominations = new int[size];
		
		System.out.println("Enter the currency denominations value");
		
		for(int i=0; i<size; i++) {
			
			denominations[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		CheckDenominations checkdenominations = new CheckDenominations();
		MergeSort mergesort = new MergeSort();
		
		mergesort.sortArray(denominations, 0, denominations.length-1);
		checkdenominations.checkPayment(denominations, amount);
		
		sc.close();

	}

}
