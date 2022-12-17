package normalquestion;

import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int num=s.nextInt();
        int rev=0;
       int n=num;
        while(n>0){
     int   i=n%10;
        rev=rev*10+i;
        n=n/10;
	}
        System.out.println(rev);
	}
}
