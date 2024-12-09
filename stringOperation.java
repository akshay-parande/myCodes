package lernJava;
import java.io.*;
public class stringOperation {
	public static void main(String []args) throws Exception{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter String to perform Operation : ");
		String str = br.readLine();
		
		// length of string or Numbers of Characters
		int cl = str.length();
		
		// Number of words in String 
		int wl = 1;
		for (int i =1;i<cl;i++) {
			if ((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				wl+=1;
			}
		}
		
		//print all outputs 
		System.out.println("Length of String or Characters in String is : "+cl);
		System.out.println("Numbers of words in String : "+wl);
	}

}
