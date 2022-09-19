package revature;

import java.util.Arrays;
import java.util.Scanner;

public class secondBest {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	for(int i=0;i<N;i++){
		int[] Gomamon = {0,0,0};
		Gomamon[0]=in.nextInt();
		Gomamon[1]=in.nextInt();
		Gomamon[2]=in.nextInt();
		Arrays.sort(Gomamon);
		System.out.println(Gomamon[1]);
	}
}
}
