package programming;

import java.util.Arrays;

public class Adding_array {
	public static void main(String[] args) {
int[]a=new int[5];
int[]b=new int[5];
int[]c=new int[5];
int num=5;
for(int i=0;i<5;i++) {
	a[i]=i;
}
for(int i=0;i<5;i++) {
	b[i]=num;
	++num;
}
for(int i=0;i<5;i++) {
	c[i]=a[i]+b[i];
}
//for(int i=0;i<5;i++) {
	System.out.print(Arrays.toString(c));
//}
	}
}
