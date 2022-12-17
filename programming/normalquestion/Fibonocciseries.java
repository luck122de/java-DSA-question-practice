package normalquestion;

import java.util.Scanner;

public class Fibonocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of term " );
	int num=sc.nextInt();
	int n1=0;int n2=1;int n;
	System.out.print(n1+" "+n2+" ");
	while(num>2) {
		n=n1+n2;
		System.out.print(n+" ");
		n1=n2;
		n2=n;
		num--;
	}
}
}
//System.out.println("enter the number to get fibonocci series ");
//Scanner sc= new Scanner(System.in);
//int num=sc.nextInt();
//int n1=0,n2=1,n3;
//System.out.print(n1+" "+n2);
//for(int i=2;i<num;i++) {
	//n3=n1+n2;
	//System.out.print(" "+n3);
	//n1=n2;
	//n2=n3;
//}

	//}

//}
