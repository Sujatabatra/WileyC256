package com.vivek.LL;

public class HashMapUsingArrays {
	
	private ArrayLL array;
	
	public HashMapUsingArrays() {
		super();
		this.array = new ArrayLL();
	}

	public void addElement(int val) {
		int idx = val%10;
		array.addAtIndex(idx,val);
	}

	public boolean searchElement(int val) {
		int idx = val%10;
		return array.searchAtIndex(idx,val);
	}

	public void deleteElement(int val) {
		int idx = val%10;
		array.deleteAtIndex(idx,val);
	}
	public void display() {
		array.display();
	}
}
