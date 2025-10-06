package Recursion_methods;

import java.util.Arrays;

public class FibonacciUsingMemoization {
	
	static int arr[] = new int [50];
	public static void main(String []Args) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		System.out.println(fibo(5));
		System.out.println(Arrays.toString(arr));
	}
	
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		else if(arr[n]!=-1) {
			return arr[n];
		}
		else {
			int fib = fibo(n-1) + fibo(n-2);
			arr[n] = fib;
			return fib;
		}
		
	}

}
