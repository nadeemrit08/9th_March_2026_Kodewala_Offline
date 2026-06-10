package in.collection.classwork2.rehashing;

import java.util.HashSet;

public class ReHashing {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("BLR1");
		set.add("BLR2");
		set.add("BLR3");
		set.add("BLR4");
		set.add("BLR5");
		set.add("BLR6");
		set.add("BLR7");
		set.add("BLR8");
		set.add("BLR9");
		set.add("BLR10");
		set.add("BLR11");
		set.add("BLR12");
		
		System.out.println(set);
		
		set.add("BLR13");
		
		System.out.println(set);
	}
}
