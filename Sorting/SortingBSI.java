
import java.util.Arrays;
import java.util.Random;

public class SortingBSI {
	
	public static void main(String []args) {
		
		//to take array with random data as input
		Random ra = new Random();
		int []arr = new int[10];
		for (int i=0; i<arr.length; i++) {
			arr[i]  = ra.nextInt(2,30);
		}
		
		System.out.println("Unsorted array");
		System.out.println(Arrays.toString(arr));
		
		//to display output using particular sorting method
		System.out.println("Using Bubble Sort");
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Using Selection Sort");
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("Using Insertion Sort");
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

		
	}
	
	//to sort taken random array
	
	//Bubble Sort Technique
	public static void bubbleSort(int []arr) {
		int len = arr.length;
		while(len>0) {
			for(int i=0; i<len-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		len--;
		}
	}
	
	//Selection Sort Technique
	public static void selectionSort(int []arr) {
		for(int i=0; i<arr.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}	
	}
	
	//Insertion Sort Technique
	public static void insertionSort(int []arr) {
		for(int i=1; i<arr.length; i++) {
			int cvalue = arr[i];
			int pindex = i-1;
			while(pindex>=0 && arr[pindex]>cvalue) {
				arr[pindex+1] = arr[pindex];
				pindex--; 
			}
			arr[pindex+1] = cvalue;
		}
		
	}
	
				
	

}
