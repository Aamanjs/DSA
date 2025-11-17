package Q14;

public class QuickSort {
	
	public static void main(String args[]) {
		
		int arr[] = {10, 7, 8 ,9, 1, 5};
		
		sort(arr, 0, arr.length-1);
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
		
	}
	
	public static void sort(int arr[], int low, int high ) {
		
		if(low >= high) {
			return;
		}
		
		int index = partiton(arr, low, high);
		sort(arr, low, index-1);
		sort(arr, index+1, high);
		
		
				
	}
	
	public static int partiton(int arr[], int low, int high) {
		
		int pivot = arr[high];
		int left = low;
		int right = high-1;
		
		while(true) {
			while(left<=right && arr[left]<pivot) {
				left++;
			}
			while(left<=right && arr[right]>pivot) {
				right--;
			}
			if(left>=right) {
				break;
			}
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		int temp = arr[left];
		arr[left] = arr[high];
		arr[high] = temp;
		
		return left;
	}

}
