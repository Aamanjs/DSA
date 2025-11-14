
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		if(n<1) {
			System.out.println("-1");
		} 
		
		System.out.println("Enter data: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();	
		}
		
		System.out.println("Array: "+ Arrays.toString(arr));
		
		BubbleSort(arr);
		
		
	}
	
	public static void BubbleSort(int arr[]){
		
		int len = arr.length;
		
		while(len > 0) {
			for(int i=0; i<len-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		 len--;
		}
		
		int secondLargest = arr[arr.length-2];
		System.out.println("Second Largest Element is: "+ secondLargest);
		
	}

}
