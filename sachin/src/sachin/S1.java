package sachin;

public class S1 {
	 public void reverseWords(String s) {
	        String words[] = s.split(" ");
	        StringBuilder res=new StringBuilder();
	        for (String word: words)
	            res.append(new StringBuffer(word).reverse().toString() + " ");
	        System.out.println(res);
	       // return new String(res);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String input=("lew emoc ot erolagnab ");
            S1 s=new S1();
		    s.reverseWords(input);
	}

}
