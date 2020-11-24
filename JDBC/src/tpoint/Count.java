package tpoint;

public class Count {

	public static void main(String[] args) {
       int consonents=0,vowels=0,digits=0,Wspaces=0;
		String str="Java Program to Count 557466 the Number of Vowels and Consonants in a Sentence";
		str=str.toLowerCase();
		System.out.println(str);
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				++vowels;
			}
			else if(ch>='b' && ch<='z') {
				++consonents;
			}
			else if(ch>='0' && ch<='9') {
				++digits;
			}
			else if(ch==' ') {
				++Wspaces;
			}
		}
		System.out.println("total vowels:"+vowels+" ");
		System.out.println("total consonents:"+consonents+" ");
		System.out.println("total digits:"+digits+" ");
		System.out.println("total Wspaces:"+Wspaces+" ");
	}

}
