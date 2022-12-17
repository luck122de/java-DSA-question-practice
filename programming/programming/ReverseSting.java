package programming;

import java.util.Scanner;

public class ReverseSting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		int l=str1.length();
		String rev="";
		for(int i=l-1;i>=0;i--) {
		rev=rev+str1.charAt(i);
		
		}
		System.out.println(rev);
			}

		}

		
		