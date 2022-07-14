/* The merge sort follows divide and conquer strategy.
 * Time Complexity for best, average and worst case is :O(nlogn)
   For breaking we need log n and of merging 2 arrays we require n so total complexity will be nlogn
 * Space complexity for merge sort is O(n) for auxiliary space. 
*/
package com.himasri.demo;

import java.util.Scanner;

public class MergeSort {
	
	public void merge(int ar[],int left,int mid,int right) {
		
		int s1=mid-left+1;
		int s2=right-mid;
		
		int leftArr[]=new int[s1];
		int rightArr[]=new int[s2];
		
		for(int i=0;i<s1;i++)
			leftArr[i]=ar[left+i];
	    for(int j=0;j<s2;j++)
	    	rightArr[j]=ar[mid+1+j];
	    
	    int i=0,j=0;
	    int k=left;
	    while(i<s1 && j<s2) {
	    	
	    	if(leftArr[i]<=rightArr[j]) {
	    		ar[k]=leftArr[i];
	    		i++;
	    	}
	    	
	    	else {
	    		ar[k]=rightArr[j];
	    		j++;
	    	}
	    	k++;
	    }
	    while(i<s1) {
	    	ar[k]=leftArr[i];
	    	i++;
	    	k++;
	    }
		while(j<s2) {
			ar[k]=rightArr[j];
			j++;
			k++;
		}
				
	}
	
	public void sort(int ar[],int left,int right) {
		if(left<right) {
			int mid=left+(right-left)/2;
			sort(ar,left,mid);
			sort(ar,mid+1,right);
			merge(ar,left,mid,right);
			
		}
	}
	
	public static void printArr(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int len;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element at "+i);
			arr[i]=sc.nextInt();
		}
		printArr(arr);
		MergeSort mg=new MergeSort();
		mg.sort(arr, 0, arr.length-1);
		System.out.println("The sorted array is:");
		printArr(arr);
		
		

	}

}
