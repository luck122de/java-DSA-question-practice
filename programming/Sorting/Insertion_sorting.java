package Sorting;

import java.util.Arrays;

public class Insertion_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,5,4,2};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void insertion(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j-1,j);
				}
				else {
					
				}
			}
			
			
		}
	}
	
	static void swap(int[] arr,int max,int last) {
		int temp=arr[max];
		arr[max]=arr[last];
		arr[last]=temp;

	}

}
