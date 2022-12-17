package Sorting;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,5,4,2};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-1-i;
			int maxindex=max(arr,0,last);
			swap(arr,maxindex,last);
		}
	}
	static int max(int[] arr,int start,int last) {
		int max=start;
		for(int i=start;i<=last;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return max;
	}
	static void swap(int[] arr,int max,int last) {
		int temp=arr[max];
		arr[max]=arr[last];
		arr[last]=temp;
	}
	

}
