package programming;

public class MinValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {18,12,-7,3,14,28};

System.out.println(minimum(arr));
	}
	static int minimum(int[] b) {
		int min=b[0];
		for(int i=0;i<b.length;i++) {
			if(min>b[i]) {
				min=b[i];
			}
		}
		return min;
	}

}
