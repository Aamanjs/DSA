package mergeSort;

import java.util.Arrays;

public class Ms1 {
	
	public static void main(String[] Args) {
		int arr[] = {6,3,9,5,2,8};
		
		System.out.println("Array: "+Arrays.toString(arr)); 

		mergeSort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr)); 
	}
	
	// -------------------------------------------------------------------
	
	public static void mergeSort(int arr[]) {
		
		if(arr.length<2) {
			return;
		}
		
		int mid = arr.length/2;
		int left[] = new int[mid];
		int right[] = new int[arr.length - mid];
		
		for(int i=0; i<mid; i++) {
			left[i] = arr[i];
		}
		
		int index=0;
		for(int j=mid; j<arr.length; j++) {
			right[index] = arr[j];
			index++;
		}
		
		mergeSort(left);
		mergeSort(right);
		
		merge(arr, left, right);
		
	}
	
	// -----------------------------------------------------------------
	
	public static void merge(int arr[], int left[], int right[]) {
		
		int i=0, j=0, k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length) {
			arr[k] = left[i];
			k++;
			i++;
		}
		
		while(j<right.length) {
			arr[k] = right[j];
			k++;
			j++;
		}
		
	}

}
