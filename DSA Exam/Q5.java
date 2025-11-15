package Q5;

import java.util.Scanner;
import java.util.Stack;

public class stack1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data: ");
		String s = sc.next();
		
		if(checkBalanced(s)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
		
	}
	
	public static boolean checkBalanced(String s) {
		
		if(s.length() == 0) {
			return true;
		}
		
		Stack<Character> ist = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '{' || ch == '[' || ch == '(' ) {
				ist.push(ch);
			}
			
			else if(ch == '}' || ch == ']' || ch == ')' ) {
				if(ist.isEmpty()) {
					return false;
				}
				
				char top = ist.pop();
				if(ch == '}' && top != '{') {
					return false;
				}
				if(ch == ')' && top != '(') {
					return false;
				}
				if(ch == ']' && top != '[') {
					return false;
				}
			}
		}
		
		return ist.isEmpty();
	}

}

