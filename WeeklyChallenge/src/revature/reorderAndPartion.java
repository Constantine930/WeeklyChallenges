package revature;
import java.util.Arrays;


public class reorderAndPartion {
public static void main(String[] args) {
		
		int[] A= {515, 341, 98, 44, 211};
		int[] L =reorderDigits(A, "asc");
		for(int i=0;i<L.length;i++) {
		System.out.println(L[i]);}
		int[] K= {-1, -20, 5, -1, -2, 2};
		System.out.println(canPartition(K));
	}
	
public static int[] reorderDigits(int[] A, String order) {
		if(order=="des") {
		int[] B = new int[A.length];
		
		for(int i=0;i<A.length;i++) {
			int length = String.valueOf(A[i]).length();
			int[] C = new int[length];
			for(int j=length-1;j>=0;j--) {
				int k = Math.floorDiv(A[i], (int) Math.pow(10, j));
				C[j]=k;
				//System.out.println( Math.pow(10, j));
				//System.out.println(C[j]  +  " " + j);
			}
			for(int m=0;m<length-1;m++) {
				C[m]=C[m]-C[m+1]*10;
				//System.out.println(C[m]);
			}
			Arrays.sort(C);
			//System.out.println(C[1]);
			int h = 0;
			for(int j=length-1;j>=0;j--){
				 h = h+(C[j]*(int) Math.pow(10, j));
			}
			//System.out.println(h + " here");
			B[i] = h;
		}
		return B;
	}else if(order=="asc"){
		int[] B = new int[A.length];
		
		for(int i=0;i<A.length;i++) {
			int length = String.valueOf(A[i]).length();
			int[] C = new int[length];
			for(int j=length-1;j>=0;j--) {
				int k = Math.floorDiv(A[i], (int) Math.pow(10, j));
				C[j]=k;
				//System.out.println( Math.pow(10, j));
				//System.out.println(C[j]  +  " " + j);
			}
			for(int m=0;m<length-1;m++) {
				C[m]=C[m]-C[m+1]*10;
				//System.out.println(C[m]);
			}
			Arrays.sort(C);
			
			int h = 0;
			for(int j=0;j<length;j++){
				 h = h+(C[j]*(int) Math.pow(10, length-j-1));
			}
			//System.out.println(h + " here");
			B[i] = h;
		}
		return B;
	}
		
		return A;}
public static boolean canPartition(int[] A) {
		int Gomamon=1;
		for(int i=0;i<A.length;i++) {
			Gomamon=Gomamon*A[i];
		}
		for(int i=0;i<A.length;i++){
			if(Gomamon/A[i]==A[i]) {
				return true;
			}
		}
		return false;
		
	}


}
