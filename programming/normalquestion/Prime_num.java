package normalquestion;

import java.util.Scanner;

public class Prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("enter the number");
       int num=s.nextInt();
       int j=0;
       if(num==1||num==0) {
    	   System.out.println(num+"is not prime number");
    	   
       }
       if(num==2) {
    	   System.out.println(num+"is  prime number");
       }
       else {
    	   for(int i=2;i<num;i++) {
    		    j=num%i;
    	   }
    		   if(j==0) {
    			 System.out.println(num+"is not prime number");  
    		   }
    		   else {
    			   System.out.println(num+"is prime number");
    		   }
    		   
    	   }
       }
	}


