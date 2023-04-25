package com.greatlearning.BalancedOrUnbalance;
import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

public class BalancingString {

	
	
	public static boolean isBracketBalanced(String input) {
		Stack<Character> stack =new Stack<Character>();
		char[] chars=input.toCharArray();
		for(int i=0;i<chars.length;i++) {
			char c = chars[i];
			if(c=='('||c=='{'||c=='[') {
				stack.push(c);
			}
			else if(c==')'||c=='}'||c==']') {
				if(stack.isEmpty()) {
					return false;
				}
				char ch=stack.pop();
				switch(c) {
				case ')':if(ch!='(')
					     return false;
				         break;
				case ']':if(ch!='[')
					     return false;
				         break;
				case '}':if(ch!='{')
					     return false;
                         break;
				}
		    }
		}
		return (stack.isEmpty());
	}

}
