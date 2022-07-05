package com.sujata.oned;

public class OneDArrayClass {

	private int arr[];
	private int totalElements;
	
	public OneDArrayClass(int totalElements) {
		this.totalElements=totalElements;
		arr=new int[totalElements];
	}
	
	public void add(int element,int index) {
		arr[index]=element;
	}
	
	public int getElement(int index) {
		return arr[index];
	}

	public int[] getArr() {
		return arr;
	}

	public int getTotalElements() {
		return totalElements;
	}
	
	
}
