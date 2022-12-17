package normalquestion;

public class prime_numberbetween_1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
        for(int i=1;i<=100;i++) {
        	for(int j=2;j<i;j++) {
        		if(i%j==0) {
        			temp=temp+1;
        		}}
        		if(temp==0) {
        			System.out.print(i+" ");
        		}
        		else {
        			temp=0;
        		}
        	}
        }
	}


