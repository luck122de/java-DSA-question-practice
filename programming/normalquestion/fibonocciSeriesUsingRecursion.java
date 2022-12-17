package normalquestion;

public class fibonocciSeriesUsingRecursion
{
	static int a=0,b=1,c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print(a+" "+b+" ");
        fibonocci(10);
       // System.out.print(" "+ans);
      //  fibonocciSeriesUsingRecursion s=new fibonocciSeriesUsingRecursion();
      //  s.fibonocci(5);
	}
//void fibonocci(int n) {
	//if(n>=1) {
	//c=a+b;
	//System.out.print(c+" ");
	//a=b;
	//b=c;
	//fibonocci(n-1);
	//}
	
//}
//}
	static void fibonocci(int n) {
		if(n>2) {
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		fibonocci(n-1);
	}
		
}}