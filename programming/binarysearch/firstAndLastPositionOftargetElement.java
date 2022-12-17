package binarysearch;

import java.util.Arrays;

public class firstAndLastPositionOftargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums= {5,7,7,7,7,8,8,10};
int target=7;
int[] ans=searchRange(nums,target);
System.out.println(Arrays.toString(ans));
	}
	static public int[] searchRange(int[] nums, int target) {
		int[] ans= {-1,-1};
		int start=search(nums,target,true);
		int end=search(nums,target,false);
		ans[0]=start;
		ans[1]=end;
		 return ans;
	 }
	static public int search(int[] nums,int target,boolean find) {
		int s=0;
		int e=nums.length-1;
		int ans=-1;
		while(s<=e) {
			int m=s+(e-s)/2;
			if(target>nums[m]) {
				s=m+1;
			}
			else if(target<nums[m]) {
				e=m-1;
			}
			else {
				ans=m;
				if(find) {
					e=m-1;
				}
				else {
					s=m+1;
				}
				
				
			}
		}
		return ans;
	}
}
