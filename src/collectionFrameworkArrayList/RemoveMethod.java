package collectionFrameworkArrayList;

import java.util.ArrayList;

public class RemoveMethod {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(123);
		obj.add("tiger");
		obj.add(true);
		System.out.println(obj);
		obj.remove(true); //using direct value
		System.out.println(obj);
	}
}
