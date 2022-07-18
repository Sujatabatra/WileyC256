package com.demo.copy;

public class Frequency {

	class Node{
		String data;
		Node left;
		Node right;
		int frequency;
		public Node(String data) {
			super();
			this.data = data;
			this.frequency = 0;
		}
	}
	Node root;
	public void insert(String value) {
		root = add(root,value);
	}
	private Node add(Node root,String value) {
		if(root==null) {
			root = new Node(value);
			root.frequency++;
			return root;
		}
		int c = value.compareTo(root.data);
		if(c<0)
			root.left=add(root.left, value);
		else if(c == 0)
			root.frequency++;
		else 
			root.right=add(root.right, value);
		return root;
	}
	
	public void inorderTraversal() {
		inorderRec(root);
	}
	
	private void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.data+" -> ["+root.frequency+"]"+"  ");
			inorderRec(root.right);
		}
	}
}
