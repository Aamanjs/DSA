package Q13;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter elements: ");
		String s[] = sc.nextLine().split(" ");
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		System.out.println("Array: "+ Arrays.toString(arr));
		
		while(n>0) {
			for(int i=0; i<n-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			n--;
		}
		
		System.out.println("Sorted Array: "+ Arrays.toString(arr));
		
	}

}
