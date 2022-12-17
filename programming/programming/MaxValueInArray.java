package programming;

import java.util.Arrays;

public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,23,43,324,23,8};
 maxval(arr,0);
 	}
static void maxval(int arr[],int s) {
	int maxvalue=arr[s];
	for(int a:arr) {
		if(maxvalue<a) {
			maxvalue=a;
		}
			}
	System.out.println(maxvalue);
	}
}
