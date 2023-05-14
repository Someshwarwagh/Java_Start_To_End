package collectionFrameworkArrayList;

import java.util.*;

public class RetainAllMethod {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(1);
		obj.add(true);
		System.out.println(obj);
		
		ArrayList obj1 = new ArrayList();
		obj1.add(true);
		obj1.add("tiger");
		System.out.println(obj1);
		
		obj1.retainAll(obj);
		System.out.println(obj1);
	}
}
