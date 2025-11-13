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
		
		CL1.deleteAtStart();
		
		CL1.deleteAtEnd();
		
		CL1.deleteBeforeGivenNode(101);

		CL1.deleteBeforeGivenNode(100);
		
		CL1.deleteBeforeGivenNode(100);
		
//		CL1.deleteAfterGivenNode(97);
//		
		CL1.deleteAfterGivenNode(99);
		
		CL1.deleteAfterGivenNode(99);
		
		
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
	
	public static void deleteAtStart() {
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
//		createNode temp = head.next;
//		tail.next = null;
//		head = temp;
//		tail.next = head;
		
		head = head.next;
		tail.next = head.next;
		tail.next = head;
		
		printData();
	}
	
	//----------------------------------------------------
	
	public static void deleteAtEnd() {
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		createNode temp = head;
		while(temp.next != tail) {
			temp = temp.next;
		}
		
//		createNode temp2 = head;
//		temp.next = null;
//		tail = temp;
//		tail.next = temp2;
		
		temp.next = head;
		tail = temp;
		
		printData();
		
	}
	
	//----------------------------------------------------
	
	public static void deleteBeforeGivenNode(int value) {
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		if(head.data == value) {
			deleteAtEnd();
			return;
		}
		
		if(head.next.data == value) {
			head = head.next;
			tail.next = head;
			printData();
			return;
		}
		
		
		createNode temp = head;
		createNode prev = null;
		while( temp.next.data != value && temp.next != head) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = prev.next.next;
		
		System.out.println(temp.data+ " " +prev.data);
		
		printData();
		
	}
	
	//----------------------------------------------------
	
	public static void deleteAfterGivenNode(int value) {
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		if(tail.data == value) {
			deleteAtStart();
			return;
		}
		
		createNode temp = head;
		while(temp.data != value && temp.next != head) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		
		printData();
		
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
