package collectionFrameworkArrayList;

import java.util.*;

public class RemoveByUsingvalueOfMethod {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(1);
		obj.add(true);
		obj.add("tiger");
		obj.add(123);
		obj.add(true);
		System.out.println(obj);
		obj.remove(Integer.valueOf(1));
		obj.remove(Boolean.valueOf(true));
		System.out.println(obj);
		
	}
}
