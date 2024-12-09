package lernJava;
import java.io.*;

public class helloWorld {
	public static void main(String []args) throws Exception {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Welcome  in Hello World File \n Enter Your Name : ");
		String name = br.readLine();
		System.out.println("Hello "+name);
	}
}
