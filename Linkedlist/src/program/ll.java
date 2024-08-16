package program;

public class ll {
	
	private node head;
	private node tail;
	
	int size;
	
	public ll() {
		this.size = 0;
	}
	public void insertfirst(int value) {
		node node = new node(value);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		size++;
		}
	}
	public void inserlast(int value) {
		
		node node = new node(value);
		tail.next = node;
		tail = node;
		size++;
	}
	public void insert(int value,int index) {
		
		if (index == 0) {
			insertfirst(value);
			return;
			
		}
		if (index == size) {
			inserlast(value);
			return;
		}
		
		node temp = head;
		
		for(int i =1;i<index;i++) {
			temp = temp.next;
		}
		node node = new node(value,temp.next);
		temp.next = node;
		size++;
	}
	public void display() {
		node temp = head;
		while(temp != null) {
			System.out.print(temp.value+ " ->");
			temp = temp.next;
		}
		System.out.println("end");
	}
	private class node{
		private int value;
		private node next;
		
		public node(int value) {
			this.value = value;
		}
		public node(int value, node next) {
			this.value = value;
			this.next = next;
		}
		
		
	}
	public void duplicate() {
		node node = head;
		while(node.next != null) {
			if (node.value == node.next.value) {
				node.next= node.next.next;
				size--;
			}
			
				node = node.next;
			
		}
		tail = node;
		node.next = null;
		
	}
	public static void main(String[] args) {
		
		ll list = new ll();
		
		list.insertfirst(10);
		list.insertfirst(45);
		list .insertfirst(45);
		list.insertfirst(45);
		list.insertfirst(200);
		
		//list.display();
	   // list.insertfirst(78);
	   // list .display();
	   // list.insert(100, 2);
	    list .display();
	    list.duplicate();
	    list.display();
	 }

}
