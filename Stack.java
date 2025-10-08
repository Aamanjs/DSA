package stack;

public class StackUsingArray {

	int arr[], top;
	int size;

	public StackUsingArray(int size) {
		this.size =size;
		arr = new int[size];
		top = -1;
	}

	public static void main(String[] args) {
		StackUsingArray s = new StackUsingArray(3);
		s.push(31);
		s.push(42);
		
		s.pop();
		
		s.peek();

	}

	public void push(int item) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		
		top++;
		arr[top] = item;
		
		System.out.println("the pushed element is: " + arr[top]);

	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.println("the pop element is: " + arr[top]);
		top--;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("The peeked element is " + arr[top]);
	}
	
	boolean isFull() {
		return top == size - 1;
	}
	
	boolean isEmpty() {
		return top == -1;
	}
}
