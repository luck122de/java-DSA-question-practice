package programming;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Dbasic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the array");
int[][] arr=new int[3][3];
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {

		arr[i][j] =sc.nextInt();
	}
	}
	for(int k=0;k<arr.length;k++) {
		//for(int j=0;j<arr[k].length;j++) {
		//	System.out.print(arr[k][j]+" ");
		//}
		//System.out.println();
		System.out.println(Arrays.toString(arr[k]));
		//}
	}

for(int [] a:arr) {
	System.out.println(Arrays.toString(a));
}

}
	}

