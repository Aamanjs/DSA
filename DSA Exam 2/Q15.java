package Q15;

public class HeapSort {
	
	public static void main(String args[]) {
		
		int arr[] = {4,	10, 3 ,5, 1, 2};
		
		heapSort(arr);
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	
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
