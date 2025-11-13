package pr;

public class SinglyCircularLL {
	
	static createNode head;
	static createNode tail;
	
	public static class createNode {
		int data;
		createNode next;
		
		public createNode(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static void main(String[] args) {
		
		SinglyCircularLL CL1 = new SinglyCircularLL();
		
		CL1.insertAtStart(98);
		CL1.insertAtStart(99);
		CL1.insertAtStart(102);
		
		
		CL1.insertAtEnd(97);
		CL1.insertAtEnd(95);
		
		CL1.insertBeforeGivenNode(99, 100);
		CL1.insertBeforeGivenNode(95, 96);
		
		CL1.insertAfterGivenNode(102, 101);
		CL1.insertAfterGivenNode(95, 94);
		
		
		
	}
	
	//----------------------------------------------------
	
	public static void insertAtStart(int data) {
		
		createNode newnode = new createNode(data);
		
		if(head == null) {
			head = tail = newnode;
			tail.next = head;
			printData();
			
			return;
		} else {
			newnode.next = head;
			head = newnode;
			tail.next = head;
			printData();
			
			return;
		}
		
		
	}
	
	//----------------------------------------------------
	
	public static void insertAtEnd(int data) {
		
		createNode newnode = new createNode(data);
		
		if(head == null) {
			head = tail = newnode;
			tail.next = head;
			printData();
			
			return;
		} else {
			tail.next = newnode;
			tail = newnode;
			tail.next = head;
			printData();
			
			
		}
	}
	
	//----------------------------------------------------
	
	public static void insertBeforeGivenNode(int value, int data) {
	
		createNode newnode = new createNode(data);
		
		if(head == null) { 
			head = tail = newnode;
			tail.next = head;
			printData();
			
			return;
		}
		
		if(head.data == value) {
			insertAtStart(data);
			return;
		}
		
		createNode temp = head;
	    do {
	        if (temp.next.data == value) {
	            newnode.next = temp.next;
	            temp.next = newnode;
	            printData();
	            return;
	        }
	        temp = temp.next;
	    } while (temp != head);


	}
	
	//----------------------------------------------------
	
	public static void insertAfterGivenNode(int value, int data) {
		
		createNode newnode = new createNode(data);
		
		if(head == null) { 
			head = tail = newnode;
			tail.next = head;
			printData();
			
			return;
		}
		
		createNode temp = head;
		do {
			if(temp.data == value) {
				newnode.next = temp.next;
				temp.next = newnode;
				if(temp == tail) {
					tail = newnode;
				}
				printData();
			}
			temp = temp.next;
		} while (temp != head);
		
		
	}
	
	//----------------------------------------------------
	
	public static void printData() {
		
		createNode temp = head;
		System.out.print("List: ");
	    do {
	        System.out.print(temp.data + " -> ");
	        temp = temp.next;
	    } while (temp != head);
	    System.out.println("(back to head)");

	}

}
