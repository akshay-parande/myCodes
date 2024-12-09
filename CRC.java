package cns.practicle;
import java.util.*;

public class CRC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Input (Binary)");
		String n = sc.nextLine();
		System.out.println("Enter Polynomial Generator (Binary)");
		String p = sc.nextLine();
		
		String ans = generateCRC(n,p);
		System.out.println("Data to Send : "+ans);
		
		errorCheck(generateCRC(n,p),p);
		
		sc.close();
	}
	
	static String generateCRC (String n,String p) {   // To Generate CRC Data directly from data and polynomial generator
		
		String temp = f1(n,p);
		ArrayList <String> temp2 = new ArrayList<>();
		temp2 = f2(temp,p);
		return (n+temp2.get(0));
	};
	
	static void errorCheck (String n, String p) {     // To check for Correction in Data received
		ArrayList <String> temp = new ArrayList<>();
		temp = f2(n,p);
		if(temp.get(0).contains("1")) {
			System.out.println("Error Contains in Data ");
		}
		else {
			System.out.println("Error Not Found ");
		}
	};
	
	static String f1 (String n , String p) {        // To add CRC 0 bit's at end 
		StringBuilder a = new StringBuilder(n);
		
		int parity = p.length();
		
		for (int i=1;i<parity;i++) {
			a.append('0');
		}
		
		return a.toString();
	}
	
	static ArrayList<String> f2 (String a , String p ) {   // To find CRC end bit's and for check correction
		StringBuilder a2 = new StringBuilder(a);           // Check by 0'th string in arraylist 
		StringBuilder a3 = new StringBuilder();
		int a_len = a.length();
		int p_len = p.length();
		int temp = a_len - p_len;
		for (int i = 0;i<=(temp);i++) {
			if (a2.charAt(i)=='0') {
				a3.append('0');
				continue;
			}
			a3.append('1');
			for (int j =0;j<p_len;j++) {
				if(a2.charAt(i+j)==p.charAt(j)) {
					a2.replace(i+j,i+j+1,"0");
				}else {
					a2.replace(i+j, i+j+1, "1");
				}
			}
		}
		
		
		ArrayList<String> ans = new ArrayList<>();
		ans.add(a2.toString().substring(temp+1));
		ans.add(a3.toString());
		return ans;
	}
	
}