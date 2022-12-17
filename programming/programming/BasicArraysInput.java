package programming;

import java.util.Arrays;

public class BasicArraysInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {1,2,3,4,5};
         System.out.println(Arrays.toString(arr));
         change(arr);
        System.out.println(Arrays.toString(arr));
	}
	static void change(int[] num) {
		num[0]=99;
	}

}
