package com.sort;

/*
 * Worst case O(n2):
 * It occurs when the pivot element picked is either the greatest or the smallest element.
 * 
 * Best case O(n*log n): 
 * It occurs when the pivot element is always the middle element or near to the middle element.
 *
 * Average case O(n*log n):
 * It occurs when the above conditions do not occur.
 * 
 * Space complexity: O(log n)
 */

public class QuickSort extends Sort {
	
	public QuickSort() {}
	
	public QuickSort(int[] arr) {
		super(arr);
	}
	
	public int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		
		int pointer = (start - 1);
		
		for(int i = start; i < end; i++) {
			if(arr[i] < pivot) {
				pointer++;
				
				swap(arr, pointer, i);
			}
		}
		
		swap(arr, (pointer + 1), end);
		
		return (pointer + 1);
	}
	
	@Override
	public int[] sort() {
		int[] arr = super.arr;
		int n = arr.length;
		
		if(n <= 1) return arr;
		
		return quickSort(arr, 0, (n - 1));
	}

	public int[] quickSort(int[] arr, int start, int end) {
		if(start < end) {
			// pivot in correct location
			int pivot = partition(arr, start, end);
			
			// left subarray
			quickSort(arr, start, (pivot - 1));
			// right subarray
			quickSort(arr, (pivot + 1), end);
		}
		
		return arr;
	}
}
