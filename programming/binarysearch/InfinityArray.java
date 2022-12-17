package binarysearch;

public class InfinityArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10,12,13,15,16,17};
		int target=16;
int s=0;
int e=1;
int temp=0;
while(target>arr[e]) {
	 temp=e+1;
	 e=e+(e-s+1)*2;
	s=temp;
}
int ans=BinarySearch(temp,e,arr,target);
System.out.println(ans);
}
static int	BinarySearch(int temp,int e,int[] arr,int target) {
	
	while(temp<=e) {
		int m=temp+(e-temp)/2;
		if(target>arr[m]) {
			temp=m+1;
		}
		else if(target<arr[m]) {
		e=m-1;	
	}
		else {
			return m;
		}
}
	return -1;
}



}

	
	
