package normalquestion;

public class Cap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] arr= {12,23,45,56,78,89,98,87,65,54,32,21};
		int[] arr= {456,123,789,987,654,321,147,258,365};
System.out.println("Total rainfall : "+ sum(arr));
System.out.println("Average rainfall : "+avg(arr,sum(arr)));
System.out.println("Lowest rainfall month : "+min(arr));
System.out.println("Highest rainfall month : "+max(arr));
	}
	static int sum(int[] arr) {
		int ans=0;
		for(int a:arr) {
			ans=ans+a;
		}
		return ans;
	}
	static int avg(int[] arr,int sum) {
		int avg=sum/arr.length;
		return avg;
	}
	static int min(int[] arr) {
		int j=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<arr[j]) {
				j=i;
			}
		}
		return j+1;
		
	}
	static int max(int[] arr) {
		int j=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>arr[j]) {
				j=i;
			}
		}
		return j+1;
		
	}

}
