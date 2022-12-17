package programming;

public class maxin2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr= {
		{12,3,45,65,68},
		{5,7,20,65},
		{35,21,2,-7},
		{6,90,-9,10}
};
System.out.println(Max(arr));

}



static int 	Max(int[][] arr) {
	int maxvalue=Integer.MIN_VALUE;
	//int[] b it means that b is variable having data type int array and going to store each array conatin in arr.
	for(int[] b:arr) {
		for(int element:b) {
			if(element>maxvalue) {
				maxvalue=element;
			}
		}
	}
	return maxvalue;
}}