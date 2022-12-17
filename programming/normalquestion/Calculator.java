package normalquestion;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number");
int num1=sc.nextInt();
System.out.println("enter the second number");
int num2=sc.nextInt();
System.out.println("select the symbol(-,+,*,/,%)");
String sym=sc.next();
int res;
switch(sym) {
case "+": res=num1+num2;
System.out.println("Additional value" +res);
break;
case "-": res=num2-num1;
System.out.println("substraction value" +res);
break;
case"*":res=num1*num2;
System.out.println("multiplication value" +res);
break;
case"/":res=num1/num2;
System.out.println("divisional value" +res);
break;
case"%":res=num1%num2;
System.out.println("remainder value" +res);
break;
}
}
	}


