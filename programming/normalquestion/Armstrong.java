package normalquestion;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
	int	n=num;
		while(num>0) {
			int x=num%10;
		sum=sum+x*x*x;
		num=num/10;
		}
		if(sum==n) {
			System.out.println("given number is armstrong");
		}
		else {
			System.out.println("given number is not armstrong");
		}
	}}

