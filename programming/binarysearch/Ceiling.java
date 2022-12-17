package binarysearch;
//find smallest number that is greater or equal to tarrget element
public class Ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,30,31,32,33,37,40};
		int t=41;
		int ans=ceiling(arr,t);
		System.out.println(ans);
		}
  static int ceiling(int[] arr,int t) {
		int s=0;
		int e=arr.length-1;
		if(t>arr[e]) {
			return -1;
		}
		while(s<=e) {
			int m=s+(e-s/2);
			if(arr[m]==t) {
				return m;
			}
			if(t>arr[m]) {
					s=m+1;
				}
					else {
						e=m-1;
					}
				}
		return s;
			
		}
    }


