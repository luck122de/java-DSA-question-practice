package programming;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {12,32,45,66,78,69,6,4};
int target=78;
int ans=linearsearch(arr,target);
System.out.println(ans);
	}
	static int linearsearch(int[] b,int t) {
		if(b.length==0) {
		return -1;
	}
		for(int i=0;i<b.length;i++) {
			int value=b[i];
			if(value==t) {
				return i;
			}}
			return -1;
		}

	}