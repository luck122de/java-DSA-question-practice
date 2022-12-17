package normalquestion;

import java.util.Scanner;

public class Fcatorial_Using_Recursion {
 static int rev=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner h=new Scanner(System.in);
		System.out.println("enter the no. of term");
		int n=h.nextInt();
		int ans=factorial(n);
		System.out.println(ans);
		//Fcatorial_Using_Recursion s=new Fcatorial_Using_Recursion();
      //  s.factorial(n);
	}
//void factorial(int n) {
	static int factorial(int n) {
		if(n>=1) {
			rev=rev*n;
			factorial(n-1);
		}
		
		return rev;
	}
	}
	
	
	//if(n>=1) {
	//rev=rev*n;
	
	//factorial(n-1);
	//}
	
	//System.out.println(rev);
	
