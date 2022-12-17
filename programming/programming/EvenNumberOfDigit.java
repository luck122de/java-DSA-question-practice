package programming;

public class EvenNumberOfDigit {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {18,124,9,1724,98,1};
System.out.println(evennumberofdigit(arr));
	}
	static int evennumberofdigit(int[] b) {
		int ans=0;
		for(int a:b) {
			int count=0;
			if(a<0) {
				a=a*-1;
			}
			while(a>0) {
				a=a/10;
				count++;
			}
			if(count%2==0) {
				ans++;
			}
		}
		return  ans;
	}

}
