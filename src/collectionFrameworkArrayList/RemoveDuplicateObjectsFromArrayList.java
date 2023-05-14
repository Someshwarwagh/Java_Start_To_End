package collectionFrameworkArrayList;

import java.util.*;

public class RemoveDuplicateObjectsFromArrayList {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(123);
		obj.add(true);
		obj.add("tiger");
		obj.add(123);
		obj.add(true);
		System.out.println(obj);
		
		HashSet hs=new HashSet(obj);
		System.out.println(hs);
		
	}
}
