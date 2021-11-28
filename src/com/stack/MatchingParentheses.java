package com.stack;

import java.util.Stack;

public class MatchingParentheses {

	public static void main(String[] args) {

		System.out.println(hasMacthingParantheses( "(" ));
		System.out.println(hasMacthingParantheses( ")" ));
		System.out.println(hasMacthingParantheses("(2+3))"));
		System.out.println(hasMacthingParantheses("(2+3)*(10/2+8)"));

	}

	public static boolean hasMacthingParantheses(String str) {

		Stack<Character> stack = new Stack<>();

		if (str == null || str.isEmpty()) {
			return true;
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (!stack.isEmpty()) {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		return stack.isEmpty();

	}

}
