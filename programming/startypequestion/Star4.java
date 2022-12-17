package startypequestion;

public class Star4 {
static int n=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<2*n;i++) {
	int t=i>n ? 2*n-i:i;
	int k=n-t;
	for(int l=0;l<k;l++) {
		System.out.print(" ");
	}
	for(int j=0;j<t;j++) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
