package Q4;

import java.util.Scanner;

public class SLL1 {
	
	static createNode head = null;
	
	static class createNode{
		
		int data;
		createNode next;
		
		public createNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//--------------------------------------------------
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of nodes: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter node data: ");
		String[] input = sc.nextLine().split(" ");
		
		for(int i=0; i<n; i++) {
			insertData(Integer.parseInt(input[i]));
		}
		
		System.out.println("Enter value to be deleted: ");
		int s = sc.nextInt();
		
		deleteData(s);
		
	}
	
	//--------------------------------------------------
	
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
	
	//--------------------------------------------------
	
	public static void deleteData(int value) {
		
		if(head == null) {
			System.out.println("List empty, Cannot delete.");
			return;
		}
		
		if(head.data == value) {
			head = head.next;
			printData();
			return;
		}
		
		createNode temp = head;
		while(temp.next != null && temp.next.data != value) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		printData();
		
	}
	
	//--------------------------------------------------
	
	public static void printData() {
		
		createNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}

}
