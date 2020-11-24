package tpoint;

import java.util.Arrays;

public class Gfg {
	public void squareofelements(int[] input) {
		int[] arr=new int[input.length];
		for(int i=0; i<input.length; i++) {
			arr[i]=input[i]*input[i];
		}
		System.out.println(arr);
		Arrays.sort(arr);
		System.out.println(arr);
	}
	public static void main(String[] args) {
		Gfg g=new Gfg();
		int[] a= {1,2,5,8,-3,-7};
		g.squareofelements(a);
	}

}
