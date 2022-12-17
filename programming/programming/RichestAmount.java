package programming;

public class RichestAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] accounts= {
		{1,2,3},
		{3,2,1}
};
System.out.println(maximumWealth(accounts));
	}
	static int maximumWealth(int[][] accounts) {
		int max=Integer.MIN_VALUE;
		for(int[] i:accounts) {
			int sum=0;
			for(int j:i) {
				sum+=j;
				
			}
			if(sum>max) {
			max=sum;	
			}
		
		}
		return max;
	}

}
