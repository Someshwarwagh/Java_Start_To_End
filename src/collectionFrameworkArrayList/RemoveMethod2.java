package collectionFrameworkArrayList;

import java.util.ArrayList;

public class RemoveMethod2 {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(123);
		obj.add("tiger");
		obj.add(true);
		System.out.println(obj);
		obj.remove(1);  //using index value
		System.out.println(obj);
	}
}
