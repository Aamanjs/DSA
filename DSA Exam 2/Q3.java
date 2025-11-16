package Q3;

import java.util.Scanner;

public class reverse {
	
	static createNode head = null;
	
	static class createNode {
		
		int data;
		createNode next; 
		
		public createNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the data");
		String s[] = sc.nextLine().split(" ");
		
		for(int i=0; i<n; i++) {
			insertData(Integer.parseInt(s[i]));
		}
		
		printData();
		
		System.out.println();
		System.out.println("Reversed linked list: ");
		reverseData(n);
		
		
	}
	
	//============================================
	
	public static void insertData(int data) {
		
		createNode newnode = new createNode(data);
		
		if(head == null) {
			head = newnode;
			return;
		}
		
		createNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
		
	}
	
	//============================================
	
	public static void reverseData(int len) {
		
		createNode temp = head;
		
		int arr[] = new int[len];
		int i=0;
		
		while(temp != null) {
			arr[i] = temp.data;
			i++;
			temp = temp.next;
		}
		
		for(int j=len-1; j>=0; j--) {
			System.out.print(arr[j]+" ");
		}
		
	}
	
	//============================================
	
	public static void printData() {
		
		createNode temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	

}
