package com.sujata.demo;

public class GenericLinkedList<T> {

	class Node{
		T data;
		Node next;
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	Node head;
	
	/*
	 * Newly created Node can be the first Node : when we don't have list
	 *  Newly created Node can be the last Node : when we have list
	 */
	public void insertElement(T data) {
		Node newNode=new Node(data);
		
		//if list is blank
		if(head==null) {
			head=newNode;
		}
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		
	}
	
	public void displayList() {
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
}
