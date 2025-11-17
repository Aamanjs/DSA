package Q15;

public class MergeSort {
	
	public static void main(String args[]) {
		
		int arr[] = {10, 7, 8 ,9, 1, 5};
		
		sort(arr);
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
		
	}
	
	public static void sort(int arr[]) {
		
		if(arr.length<2) {
			return;
		}
		
		int mid = arr.length/2;
		int left[] = new int[mid];
		int right[] = new int[arr.length-mid];
		
		for(int i=0; i<mid; i++) {
			left[i] = arr[i];
		}
		
		int index = 0;
		for(int j=mid; j<arr.length; j++) {
			right[index] = arr[j];
			index++;
		}
		
		sort(left);
		sort(right);
		merge(arr, left, right);
		
	}
	
	public static void merge(int arr[], int left[], int right[]) {
		
		int i=0, j=0, k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) {
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
			i++;
			k++;
		}
		
		while(j<right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
		
	}

}
