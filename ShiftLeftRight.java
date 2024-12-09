package project.practice;

import java.util.*;

public class ShiftLeftRight {

	public static int[]shiftr(int[]arr,int s){
		int size = arr.length;
		int []temp = new int [size];
		for(int i =0;i<size;i++) {
			s=s%size;
			temp[s]=arr[i];
			s++;
		}
		return temp;
	}
	public static int[]shiftl(int[]arr,int s){
		int size = arr.length;
		int temp[]=new int[size];
		s=s%size;
		s = size -s;
		for(int i =0;i<size;i++) {
			s=s%size;
			temp[s]=arr[i];
			s++;
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr =new int[5];
		for(int i =0;i<5;i++) {
			arr[i]=sc.nextInt();
		}

		arr=shiftl(arr,42);
		for(int i = 0;i<5;i++) {
			System.out.println(arr[i]);
		sc.close();
		}
	}	
}

