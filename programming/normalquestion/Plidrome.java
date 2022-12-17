package normalquestion;

import java.util.Scanner;

public class Plidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int x=num;
      int sum=0;
      while(x>0){
    	  int y=x%10;
    	  sum = sum*10 + y;
    	  x=x/10;
      }
      if(sum==num) {
    	  System.out.println(num+"number in palidorme");
      }
      else {
    	  System.out.println(num+"number is not palidrome");
      }
	}

}
