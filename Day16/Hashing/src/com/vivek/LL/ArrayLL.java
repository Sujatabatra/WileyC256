package com.vivek.LL;

public class ArrayLL {

	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	
	Node table[] = new Node[10];

	public Node[] getTable() {
		return table;
	}
	public void addAtIndex(int idx,int val) {
		if(table[idx] == null)
			table[idx] = new Node(val);
		else {
			Node newNode = new Node(val);
			newNode.next = table[idx];
			table[idx] = newNode;
		}
	}
	public boolean searchAtIndex(int idx,int val) {
		Node curr = table[idx];
		while(curr!=null) {
			if(curr.data == val)
				return true;
		}
		return false;
	}
	public void deleteAtIndex(int idx,int val) {
		Node curr = table[idx];
		Node prev=null;
		while(curr!=null) {
			if(curr.data == val)
			{
				if(prev == null)
				{
					table[idx] = curr.next;
					return;
				}
				prev.next = curr.next;
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}
	public void display() {
		for(int i=0;i<10;i++)
		{
			Node curr = table[i];
			if(curr==null)
				continue;
			while(curr!=null)
			{
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
			System.out.println();
		}
	}
}
