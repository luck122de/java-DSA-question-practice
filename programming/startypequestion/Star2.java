package startypequestion;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
for(int i=0;i<=n;i++) {
	for(int j=0;j<=n-i;j++) {
		System.out.print("*");
	}
	System.out.println("");
}
	}

}
