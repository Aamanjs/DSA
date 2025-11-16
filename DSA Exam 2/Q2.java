package Q2;

import java.util.Scanner;

public class MissingNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the elements: ");
		String s[] = sc.nextLine().split(" ");
		
		int arr[] = new int[n-1];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		System.out.println(findMissing(arr, n));
		
	}
	
	public static int findMissing(int arr[], int n) {
		
		int totalSum = n*(n+1)/2;
		int arraySum = 0;
		
		for(int x: arr) {
			arraySum = arraySum + x;
		}
		
		return totalSum - arraySum;
	}

}
