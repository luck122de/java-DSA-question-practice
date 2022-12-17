package normalquestion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num==1||num==0) {
			System.out.println("factorial of num is 1");
			
		}
		int sum=1;
		
		while(num>1) {

			sum=num*sum;
			num--;
		}
		System.out.println("factorial of number is"+ sum);
	}
	}
