package sachin;

public class Lastlength {
	public int lengthOfLastWord(final String a) {
		int length=0;
		String str=a.trim();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				length=0;
			}
			else {
				length++;
			}
		}
		return length;
	}

	public static void main(String[] args) {
		String input=" fdsdvfbdfbgbg dfrgr fwefesg efwefwef";
		Lastlength l=new Lastlength();
		System.out.println(l.lengthOfLastWord(input));
		
	}

}
