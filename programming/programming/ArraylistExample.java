package programming;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the value");
     ArrayList<Integer> list=new ArrayList<>(1);
     //list.add(6);
     //list.add(9);
     //list.add(209);
     //System.out.println(list);
     for(int i=0;i<5;i++) {
    	 list.add(sc.nextInt());
     }
    // for(int i=0;i<5;i++) {
     System.out.println(list);
	}

	}
