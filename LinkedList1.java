
public class LinkedList1 {
	
	SinglyLinkedListNode head = new SinglyLinkedListNode(99);
	
	class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
		public SinglyLinkedListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// -----------------------------------------------------------------------------------
	
	public void inserAtBeginning(int data) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		newnode.next = head;
		head = newnode;
		
		//traversing the list
		SinglyLinkedListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data+ " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	// -----------------------------------------------------------------------------------
	
	public void insertAtEnd(int data) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		if(head == null) {
			System.out.println("no list is present");
			head = newnode;
			return;
		}
		
		//if the list is present, this node is to be added at first node
		SinglyLinkedListNode temp = head;
		while(temp.next != null) {
			//System.out.println(temp.data+ " -> ");
			temp = temp.next;
		}
		temp.next = newnode;
		
		//to print link list after adding elemnt at end
		SinglyLinkedListNode itr = head;
		while(itr != null) {
			System.out.print(itr.data+ " -> ");
			itr = itr.next;
		}
		System.out.println();
		return;
	}
	
	// ----------------------------------------------------------------------------------
	
	public void insertBeforeGivenNode(int insertData, int value) {    // insertData -> value to be inserted // value -> Node before which value is to be inserted
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(insertData);
		if(head == null) {
			System.out.println("no list is present");
			head = newnode;
			return;
		}
		SinglyLinkedListNode temp = head;
		SinglyLinkedListNode prev = null;
		while(temp.next != null && temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		newnode.next = temp;
		prev.next = newnode;		
		
		//to print link list after adding element in between
				SinglyLinkedListNode itr = head;
				while(itr != null) {
					System.out.print(itr.data+ " -> ");
					itr = itr.next;
				}
				System.out.println();
				return;
	}
	
	// ----------------------------------------------------------------------------------
	
	public void insertAfterGivenNode(int insertData, int value) { // insertData -> value to be inserted // value -> Node after which value is to be inserted
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(insertData);
		if(head == null) {
			System.out.println("no list is present");
			head = newnode;
			return;
		}
		SinglyLinkedListNode temp = head;
		while(temp.next != null && temp.data != value) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
		
		//to print link list after adding element in between
		SinglyLinkedListNode itr = head;
		while(itr != null) {
			System.out.print(itr.data+ " -> ");
			itr = itr.next;
		}
		System.out.println();
		return;
	}
	
	
	
	
	public static void main(String[] args) {
		LinkedList1 l22 = new LinkedList1();
		l22.inserAtBeginning(101);
		l22.inserAtBeginning(102);
		l22.inserAtBeginning(104);
		
		l22.insertAtEnd(98);
		
		l22.insertBeforeGivenNode(100, 99);
		
		l22.insertAfterGivenNode(103, 104); 
	}

}
