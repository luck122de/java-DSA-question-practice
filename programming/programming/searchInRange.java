package programming;

public class searchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {18,12,-7,3,14,28};
		int target=-7;
		int ans=linearsearch(arr,target,1,4);
		System.out.println(ans);
			}
			static int linearsearch(int[] b,int t,int s,int e) {
				if(b.length==0) {
				return -1;
			}
				for(int i=s;i<e;i++) {
					int value=b[i];
					if(value==t) {
						return i;
					}}
					return -1;
				}

			
	}


