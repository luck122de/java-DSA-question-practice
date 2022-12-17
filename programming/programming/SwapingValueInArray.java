package programming;

import java.util.Arrays;
import java.util.Scanner;

public class SwapingValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] arr= {1,3,28,27,29};
		int[] arr=new int[5];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of array");
		for(int i=0;i<5;i++) {
			 arr[i]=in.nextInt();
		}
swap(arr,1,3);
System.out.println(Arrays.toString(arr));
	}
	static void swap(int b[],int i,int j) {
		int temp=b[i];
		b[i]=b[j];
		b[j]=temp;
	}

}
