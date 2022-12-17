package binarysearch;
public class Find_Smallest_Letter_Greater_Than_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] letters= {'c','f','j'};
         char target ='a';
         char ans=findsmallest(letters,target);
         System.out.println(ans);
}
	static char findsmallest(char[] letters,char target ) {
		int s=0;
		int e=letters.length-1;
		while(s<=e) {
			int m=s+(e-s)/2;
			if(target>=letters[m]) {
				s=m+1;
			}
			else {
				e=m-1;
			}
		}
		return letters[s%(letters.length)];
	}
}
/*https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/*/