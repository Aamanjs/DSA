package Q3;

import java.util.Scanner;

public class SLL {
	
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
		
		System.out.println("Enter number of nodes: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter node data: ");
		String[] input = sc.nextLine().split(" ");
		
		for(int i=0; i<n; i++) {
			insertData(Integer.parseInt(input[i]));
		}
		
		System.out.println("Enter position: ");
		int pos = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter value: ");
		int val = Integer.parseInt(sc.nextLine());
		
		insertAtPosition(pos, val);
		
	}
	
	//---------------------------------------------------
	
	public static void insertData(int data) {
		
		createNode newnode = new createNode(data);
		
		if(head == null) {
			head = newnode;
		} else {
			createNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
		
	}
	
	//---------------------------------------------------
	
	public static void insertAtPosition(int pos, int val) {
		
		createNode newnode = new createNode(val);
		
		if(pos == 1) {
			newnode.next = head;
			head = newnode;
		}
		
		createNode temp = head;
		for(int i=1; i<pos-1 && temp!=null; i++) {
			temp = temp.next;
		}
		
		if (temp == null) {
			System.out.println("Position out of bound");
			return;
		}
		
		newnode.next = temp.next;
		temp.next = newnode;
		
		printData();
	}
	
	//---------------------------------------------------
	
	public static void printData() {
		
		createNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	
	
	
	
	

}
