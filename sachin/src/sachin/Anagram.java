package sachin;

import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "silent";
		String str2= "listen";
        char[] i = str1.toCharArray();
        char[] j = str2.toCharArray();
	    Arrays.sort(i);
	    Arrays.sort(j);
	    System.out.println(i);
	    System.out.println(j);
		
	}
}
