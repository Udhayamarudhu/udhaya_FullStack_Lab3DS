package com.greatlearning.BalancedOrUnbalance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string for balancing : ");
		String input = in.nextLine();
		if(BalancingString.isBracketBalanced(input)) {
			System.out.println("Brackets are Balanced..");
		}
		else {
			System.out.println("Brackets are UnBalanced..");
		}

	}
}
