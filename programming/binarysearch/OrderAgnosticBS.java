package binarysearch;
//in this q. it is given that arr is sorted
public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,30,31,32,33,37,40};
		int t=40;
		int ans=OrderAgnosticBS(arr,t);
		System.out.println(ans);
	}
	static int OrderAgnosticBS(int[] arr,int t) {
		//good developer copy and great developer paste
		int s=0;
		int e=arr.length-1;
		boolean asc=arr[s]<arr[e];
		while(s<=e) {
		int m=s+(e-s/2);
		if(arr[m]==t) {
			return m;
		}
		if(asc) {
		if(t>arr[m]) {
			s=m+1;
		}
		else {
			e=m-1;
		}
		}
		else {
			if(t>arr[m]) {
				e=m-1;
			}
			else {
				s=m+1;
			}
		}
		}
		return -1;
		}
	}


		