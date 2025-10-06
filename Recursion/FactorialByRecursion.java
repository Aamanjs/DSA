package Recursion_methods;

public class FactorialByRecursion {

	public static void main(String[] args) {
		
		int n = FactorialByRecursion(5);
		System.out.println("Factorial = "+n);

	}
	
	 public static int FactorialByRecursion(int n) {
		
		if(n == 1)
			return n;
		
		return n* FactorialByRecursion(n -1); 
	}

}
