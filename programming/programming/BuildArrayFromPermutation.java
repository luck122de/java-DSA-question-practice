package programming;

import java.util.Arrays;

public class BuildArrayFromPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums= {0,2,1,5,3,4};
int [] arr=buildArray(nums);
System.out.println(Arrays.toString(arr));
//System.out.println(Arrays.toString(buildArray(nums)));
	}
	 
	static int[] buildArray(int[] nums) {
		int[] arr=new int[nums.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=nums[nums[i]];
		}
		return arr;
	}
		//System.out.println(Arrays.toString(arr));

		
	}


//static int[] buildArray(int[] nums) {
	//int[] arr=new int[nums.length];
	//for(int i=0;i<nums.length;i++)
	//{
	//	for(int j=i;j<=i;j++)
		
		//{
		 //int t=nums[i];
		 a//rr[j]=nums[t];