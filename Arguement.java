package assignment;

import java.util.Scanner;

public class Arguement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s=sc.nextLine();
//		String r=sc.nextLine();
//		int a1 =(int)s.charAt(0);
//		int a2 =(int)r.charAt(0);
//		if(a1>a2)
//		
//		{
//			System.out.println(r+","+s);
//		}
//		else {
//		System.out.println(s+","+r);
//	}
		int n =sc.nextInt();
		int sum=0;
 int[] arr = new int[n];
 for(int i=0;i<=arr.length-1;i++) {
	 arr[i] = sc.nextInt();
 }
 for(int i=0;i<=arr.length-1;i++) {
	 sum+=arr[i];
 }
 System.out.println(sum);
 float avg=sum/arr.length;
 System.out.println(avg);
 sc.close();
 
 
}
}
