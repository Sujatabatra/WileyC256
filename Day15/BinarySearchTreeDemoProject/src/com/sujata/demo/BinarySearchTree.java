package com.sujata.demo;

public class BinarySearchTree {

	class Node{
		int key;
		Node left,right;
		public Node(int key) {
			super();
			this.key = key;
		}
		
	}
	
	Node root;
	
	public void insert(int key) {
		root=insertRec(root, key);
	}
	private Node insertRec(Node root,int key) {
		//if the tree is empty
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.key)
			root.left=insertRec(root.left, key);
		else if(key>root.key)
			root.right=insertRec(root.right, key);
		
		return root;
	}
	
	public void inorderTraversal() {
		inorderRec(root);
	}
	
	//Left,root,right
	private void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
}
