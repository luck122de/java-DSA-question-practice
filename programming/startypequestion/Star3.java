package startypequestion;

public class Star3 {
static int n=5;
static int t=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=0;i<=2*n;i++) {
        	if(i<=n) {
        		t=n-i;
        	}
        	else {
        		t=i-n;
        	}
        	
        	
        	for(int j=0;j<t;j++) {
        		System.out.print(" ");
        	}
        	for(int k=t;k<n;k++) {
        	System.out.print("*");
        }
        	System.out.println("");
	}

	}
}