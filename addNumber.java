package lernJava;
import java.io.*;

public class addNumber {
	public static void main(String []args) throws Exception, Exception {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter Number Inputs : ");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter Numbers : ");
		int sum =0;
		for (int i=0;i<n;i++) {
			int temp = Integer.parseInt(br.readLine());
			sum = sum + temp;
		}
		System.out.println("The Sum of Numbers is : "+sum);
	}
	
}
