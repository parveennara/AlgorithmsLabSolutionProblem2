package com.greatlearning.service;

public class MergeSort {
	
	public void sortArray(int [] arr, int left, int right) {
		
		if (left < right) {
			
			int mid = left + (right - left)/2;
			sortArray(arr, left, mid);
			sortArray(arr, mid+1, right);
			
			mergeArray(arr, left, mid, right);
		}		
	}
	
	public void mergeArray(int[] arr, int left, int mid, int right) {
		
		int length1 = mid - left + 1;
		int length2 = right - mid;		
		
		int[] arrayLeft = new int[length1];
		int[] arrayRight = new int[length2];
		
		for (int i = 0; i < length1; i++) {
			arrayLeft[i] = arr[left + i];
		}
		
		for (int j = 0; j < length2; j++) {
			arrayRight[j] = arr[mid + 1 + j];
		}
		
		int i = 0, j = 0;
		int k = left;
		
		while (i < length1 && j < length2) {
			
			if (arrayLeft[i] >= arrayRight[j]) {
				
				arr[k] = arrayLeft[i];
				i++;
			} else {
				
				arr[k] = arrayRight[j];
				j++;
			}
			
			k++;
		}
		
		while (i < length1) {
			
			arr[k] = arrayLeft[i];
			i++;
			k++;
		}
		
		while (j < length2) {
			
			arr[k] = arrayRight[j];
			j++;
			k++;
		}
	}

}

