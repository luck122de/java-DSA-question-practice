package normalquestion;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition sc= new Addition();
sc.add1(20,30);
sc.add1(5, 6, 8);

	}

}
class Addition{
	public void add1(int a,int b) {
		System.out.println(a+b);
	}
	public void add1(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
