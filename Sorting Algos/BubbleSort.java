package com.krishna.sorting;

//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping 
//the adjacent elements if they are in the wrong order. 

//The best-case time complexity of bubble sort algorithm is O(n) time complexity.
//The worst-case time complexity of bubble sort algorithm is O(n^2) time complexity.
//The average-case time complexity of bubble sort algorithm is O(n^2) time complexity.


class BubbleSort {
	void bubbleSort(int arr[])
	{
	int n = arr.length;
	 for (int i = 0; i < n - 1; i++) {
		 boolean swapped = false;
	   for (int j = 0; j < n - i - 1; j++) {
	     if (arr[j] > arr[j + 1]) {
	       // swapping arr[j+1] and arr[j]
	       int temp = arr[j];
	       arr[j] = arr[j + 1];
	       arr[j + 1] = temp;
	       swapped = true;
	     }
	   }
	   if (swapped == false) {
		   break;
	   }
	 }
	}
	
	void printArray(int arr[])
	{
	 int n = arr.length;
	 for (int i = 0; i < n; ++i)
	   System.out.print(arr[i] + " ");
	 System.out.println();
	}
	
	public static void main(String args[])
	{
	 BubbleSort ob = new BubbleSort();
	 int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
	 ob.bubbleSort(arr);
	 System.out.println("Sorted array");
	 ob.printArray(arr);
	}
}
