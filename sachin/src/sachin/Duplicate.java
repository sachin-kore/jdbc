package sachin;

import java.util.HashSet;

public class Duplicate {
	public boolean duplicatepresent(int[] nums) {
	HashSet<Integer>hs=new HashSet<Integer>();
	for(int i:nums) {
		if(hs.contains(i)) {
			return true;
		}
		else {
			hs.add(i);
		}
	}
	return false;
	}
	public static void main(String[] args) {
      int[] nums= {1,2,3,4,1};
      Duplicate d=new Duplicate();
      d.duplicatepresent(nums);
      System.out.println(nums);
	}

}
