package com.greatlearning.BinarySearchTree;
import java.util.HashSet;
import java.util.Set;


public class PairSum {
	

	
	
public static boolean findSumPair(Node root,int sum,Set<Integer> data){
	if(root==null) {
		return false;
	}
	
	if(findSumPair(root.left,sum,data)) {
		return true;
		
		}
	int remainder=sum-root.data;
	if(data.contains(remainder)) {
		System.out.println("The pair ("+root.data+","+remainder+" )can form the given sum");
		return true;
	}
	else {
		data.add(root.data);
		
	}
	return findSumPair(root.right,sum,data);
	
		
	}

}
