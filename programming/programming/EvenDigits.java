package programming;

public class EvenDigits {
//static int k=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums={18,124,9,-1724,98,1};
System.out.println(FindNumbers(nums));
	}
//static int	FindNumbers(int[] nums) {
	//for(int i=0;i<nums.length;i++) {
		//int count=0;
		//if(nums[i]<0){
	// nums[i]=nums[i]*-1;
	//}
	//while(nums[i]>0) {
		// nums[i]=nums[i]/10;
		//count++;
	//}
	//if(count%2==0) {
	//	k++;
	//}
	//}
	//return k;
	static int FindNumbers(int []nums) {
		int count=0;
		for(int n:nums) {
		if(even(n)) {
			count++;
		}}
		return count;
	}
		static boolean even(int n) {
			int numofdigit=digit(n);
			return numofdigit%2==0;
					
		}
		static int digit(int n) {
			int count=0;
			if(n<0) {
				n=n*-1;
			}
			while(n>0) {
				count++;
				n=n/10;
			}
			return count;
		}
}

//static int FindNumbers(int[] nums) {
	//int count=0;
	//for(int num:nums) {
	//	if(even(num)) {
			//count++;
	//	}
	//}
	//return count;
//}
//}
//static boolean even(int num) {
//	int numberofdigits=digits(num);
//	return numberofdigits%2==0;
//}
//static int digits(int num) {
//int count=0;
//if(num<0) {
	//num=num*-1;
//}
//while(num>0) {
//	count++;
	//num=num/10;
//}
//return count;
//}
//}
