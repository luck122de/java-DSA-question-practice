package binarysearch;
//find greatest number smaller or equal to tarrget element
public class floor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,9,14,16,18};
		int t=1;
		int ans=floor(arr,t);
		System.out.println(ans);
	}
	static int floor(int[] arr,int t) {
		
		int s=0;
		int e=arr.length-1;
		boolean asc=arr[e]>arr[s];
		
		
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
		return e;
			
		}
	}
