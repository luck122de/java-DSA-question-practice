package binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,30,31,32,33,37,40};
		int t=33;
		int ans=binarysearch(arr,t);
		System.out.println(ans);
	}
	 static int binarysearch(int[] arr, int t) {
		// TODO Auto-generated method stub
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int m=s+(e-s)/2;
			if(arr[m]>t) {
				e=m-1;
			}
			else if(arr[m]<t) {
				s=m+1;
			}
			else {
				return m;
			}
		}
		return -1;
	}
}
	



