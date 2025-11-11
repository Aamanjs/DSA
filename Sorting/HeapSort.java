package heapSort;

import java.util.Arrays;
import java.util.Random;

public class HP1 {
	
	public static void main(String[] args) {
		
		Random ra = new Random();
		int arr[] = new int[7];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ra.nextInt(0, 35);
		}
		
		System.out.print("Array: ");
		System.out.println(Arrays.toString(arr));
		
		heapSort(arr);	
		System.out.print("Sorted Array: ");
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void trio(int arr[], int n, int i) {
		int max = i;
		int leftChild = 2*i+1;
		int rightChild = 2*i+2;
		
		if(leftChild<n  &&  arr[leftChild]>arr[max]) {
			max = leftChild;
		}
		
		if(rightChild<n && arr[rightChild]>arr[max]) {
			max = rightChild;
		}
		
		if(max!= i) {
			int temp = arr[i];
			arr[i] =  arr[max];
			arr[max] =  temp;
			
			trio(arr, n, max);
		}
		
		
	}
	
	public static void heapSort(int arr[]) {
		
		int n = arr.length;
		
		for(int i=n/2-1; i>=0 ;i--) {
			trio(arr, n, i);
		}
		
		for(int i=n-1; i>=0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			trio(arr, i, 0);
		}
			
	}

}
