package lernJava;
import java.util.Scanner;
public class patternPrint {
	
	public static void main(String[]ag) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int x = (2*n)-1;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<(x);j++) {
				if(j<((x/2)+i+1) && j>((x/2)-i-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
