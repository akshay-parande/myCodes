package lernJava;
import java.io.*;

public class fileHandaling {
	public static void main(String []args) throws Exception {

		
		BufferedReader bro = new BufferedReader (
				new InputStreamReader(System.in));
		
		FileWriter fo = new FileWriter("Hello.txt");
		
		System.out.println("Enter String to Input in file : ");
		String temp = bro.readLine();
		fo.append(temp);
		fo.close();
		bro.close();
		
		FileReader fr = new FileReader("Hello.txt");
		
		BufferedReader bri = new BufferedReader(fr);
		String str2 = bri.readLine();
		System.out.println(str2);
		
		fr.close();
		bri.close();
	}
}
