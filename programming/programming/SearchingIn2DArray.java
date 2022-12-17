package programming;

import java.util.Arrays;

public class SearchingIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr= {
		{12,3,45,65,68},
		{5,7,20,65},
		{35,21,2,-7},
		{6,90,-9,10}
};
int target=21;
int[] ans = search(arr,target);
System.out.println(Arrays.toString(ans));//Arrays.toString is used print array
	}
	//ensure the return type of method 
	static int[] search(int[][] arr,int target) {
	for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j] == target) {
					return new int[]{i, j};
				}
			}
		}
		//always care of this statement 
		return null;
		// return new int[]{
	}

}
