package sachin;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {	
	  ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        System.out.println("using advanced for loop:");
        for(Integer num:al) {
        	System.out.println(num);
       }
        }

}
