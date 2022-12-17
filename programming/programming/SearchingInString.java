package programming;

import java.util.Arrays;

public class SearchingInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Ankit";
char target='k';
System.out.println(Searching(str,target));
//System.out.println(Arrays.toString(str.toCharArray()));
	}
	static boolean Searching(String str,char t) {
		if(str.length()==0) {
			return false;
		}
		//for(int i=0;i<str.length();i++)
		for(char ch:str.toCharArray())//to convert string in array 
		{
			if(t==ch) {
				return true;
			}
		}
		
	
	return false;
	}
}
