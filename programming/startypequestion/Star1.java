package startypequestion;

import java.util.Scanner;

public class Star1 {
static int t=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
for(int i=0;i<2*n;i++) {
	if(i<n) {
		t=i;
	}
	else {
		t=n-(i-n);
	}
	for(int j=0;j<t;j++) {
		System.out.print("*");
	}
	System.out.println("");
}
	}

}
                         