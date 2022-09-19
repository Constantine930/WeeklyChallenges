package revature;

import java.util.Scanner;

public class sumInString {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int T = in.nextInt();
	in.nextLine();
	for(int i=0;i<T;i++) {
		String Bob = in.nextLine();
		int L = Bob.length();
		String Gomamon = Bob.replaceAll("[a-zA-Z]", "0");
		int Sum = 0;
		for(int j = 0;j<L;j++) {
			Sum = Sum + Gomamon.charAt(j)-'0';
		}
		System.out.println(Sum);
	}
}
}
