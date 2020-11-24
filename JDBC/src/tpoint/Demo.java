package tpoint;

public class Demo {
	public static void SwapNumbers(int a,int b) {
		b=b+a;
		a=b-a;
		b=b-a;
	}
	public static void main(String[] args) {
	  int a=10;
	  int b=20;
	  SwapNumbers(a,b);
		System.out.printf("a is %d, b is %d",a,b);
	}
}
