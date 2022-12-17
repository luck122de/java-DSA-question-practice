package programming;

import java.util.Arrays;
import java.util.Scanner;

public class BasicStringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[4];
Scanner sc= new Scanner(System.in);
System.out.println("enter the the string");
for(int i=0;i<str.length;i++) {
	str[i]=sc.next();
}
System.out.println(Arrays.toString(str));
str[1]="ankit";
System.out.println(Arrays.toString(str));


	}

}
//Scanner sc=new Scanner(System.in);
//System.out.println("enter the string");
//String[] str=new String[4];
//for(int i=0;i<str.length;i++) {
//str[i]=sc.next();
//}
//for(String s: str) {
//	System.out.print(s+" ");
//}
//System.out.println(Arrays.toString(str));
//str[1]= "ankit";
//System.out.print(Arrays.toString(str));