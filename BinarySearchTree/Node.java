package com.greatlearning.BinarySearchTree;

public class Node {
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
	public Node insertData(int data,Node root) {
		if(root==null) {
			return new Node(data);
		}if(data<root.data) {
			root.left=insertData(data,root.left);
		}
	    else if(data>root.data) {
			root.right=insertData(data,root.right);
		}
		else {
				
			System.out.println("Given data is already present in the BST ");
		}
		
		return root;
		
	}
	
	

}
