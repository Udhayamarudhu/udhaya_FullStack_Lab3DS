package com.greatlearning.BinarySearchTree;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node root=new Node(40);
		root.insertData(10,root);
		root.insertData(20,root);
		root.insertData(30,root);
		root.insertData(50,root);
		root.insertData(60,root);
		root.insertData(70,root);
		System.out.println("Enter the sum of the pair :");
		int sum=sc.nextInt();
		Set<Integer> data = new HashSet<Integer>();
		if(!PairSum.findSumPair(root,sum,data)) {
			System.out.println("Pair does not exist for sum");
		}
		
	}
}
