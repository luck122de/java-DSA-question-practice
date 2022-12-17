package normalquestion;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the the value of leap year");
Scanner sc= new Scanner(System.in);
int y=sc.nextInt();
if(y%400==0 || (y%4==0&y%100!=0)) {
	System.out.println(y+"year is leap year ");
}
else {
	System.out.println(y+"year is not leap year");
}

	}

}
