package Q13;

public class SelectionSort {
	
	public static void main(String [] args) {
		
		int arr[] = {64, 25, 12, 22, 11};
		
		sort(arr);
		
	}
	
	public static void sort(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		for(int x : arr) {
			System.out.print(x+ " ");
		}
	}
}
