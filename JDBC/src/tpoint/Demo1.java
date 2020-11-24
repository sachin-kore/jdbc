package tpoint;

import java.util.HashSet;

public class Demo1 {
	public static boolean containsduplicate(int []nums) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i:nums) {
			if(set.contains(i)) {
				//System.out.println(i);
				return true;
			}
			else {
				set.add(i);
			}
			System.out.println(i);
		}
		return false;
	}

	public static void main(String[] args) {
		int []input= {1,2,3,1};
		Demo1.containsduplicate(input);
	}

}
