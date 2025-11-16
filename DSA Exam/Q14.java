package Q14;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter elements: ");
		String[] s = sc.nextLine().split(" ");
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		System.out.println("Array: "+Arrays.toString(arr));
		
		sort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		
	}
	
	
	public static void sort(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}
