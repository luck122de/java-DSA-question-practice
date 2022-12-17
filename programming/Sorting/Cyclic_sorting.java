package Sorting;

import java.util.Arrays;

public class Cyclic_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,2,1,4};
		cyclic(arr);
		System.out.println(Arrays.toString(arr));
	}
static void cyclic(int[] arr) {
	int n=0;
	while(n<arr.length) {
		if(n!=arr[n]-1) {
			swap(arr,n,arr[n]-1);
		}
		else {
			n++;
		}
	}
	
}
	static void swap(int[] arr,int n,int m){
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
}
}
