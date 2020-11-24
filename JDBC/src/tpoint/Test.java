package tpoint;

public class Test {
		public static void printFibonacciSeries(int count) {
			if(count<1) {
				System.out.println(count);
			}
			int a = 0;
			int b = 1;
			int c = 1;
			for (int i = 1; i <= count; i++) {
				System.out.print(b + ", ");
				a = b;
				b = c;
				c = a + b;
			}
		}
		public static void main(String[] args) {
			Test.printFibonacciSeries(8);
	}

}
