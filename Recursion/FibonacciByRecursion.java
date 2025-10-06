package Recursion_methods;

import java.util.Scanner;

public class FibonacciByRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no = sc.nextInt();
		
		int number = fibonacciByRecursion(no);
		
		System.out.println("Fibonacci No :"+number);
		
		sc.close();

	}
	public static int fibonacciByRecursion(int n) {
		
		if(n == 1||n == 0){
			return n;
		}
		return fibonacciByRecursion(n - 1)+ fibonacciByRecursion(n - 2);
	
	}
	
}
