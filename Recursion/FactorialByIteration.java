package Recursion_methods;

import java.util.Scanner;

public class FactorialByIteration {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no for Factorial: ");
		int no = sc.nextInt();
		
		int num = FactorialByIteration(no);
		System.out.println("Factorial = "+num);
		
		sc.close();
	}
	
	public static int FactorialByIteration(int n) {
		int tem = 1;
		for(int i = n;i>=1;i--) {
			
			tem = i*tem; 
		}
		return tem;
	}

}
