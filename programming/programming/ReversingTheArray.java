package programming;

import java.util.Arrays;

public class ReversingTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
	}
static void reverse(int[] b,int s,int e) {
	while(s<e) {
		swap(b,s,e);
		s++;
		e--;
	}
}
static void swap(int[] b,int i,int j) {
	int temp=b[i];
	b[i]=b[j];
	b[j]=temp;
}
}
