package sachin;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n, count=0, a;
		String x=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of number:");
		n=sc.nextInt();
		sc.close();
		while(n>0) {
			a=n%2;
			if(a==1) {
				count++;
			}
			x=a+" "+x;
			n=n/2;
		}
		System.out.println("binary numbers:"+x);
		System.out.println("number of 1's:"+count);
	}

}
