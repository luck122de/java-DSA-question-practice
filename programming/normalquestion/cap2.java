package normalquestion;

import java.util.Scanner;

public class cap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Factors(num);
        numberofdigit(num);
	}
	static void Factors(int num) {
		for(int i=1;i<=100;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
	}
	static void numberofdigit(int num) {
		int c=0;
		while(num>0) {
			num=num/10;
			c++;
		}
		System.out.println(c);
	}
	

}
