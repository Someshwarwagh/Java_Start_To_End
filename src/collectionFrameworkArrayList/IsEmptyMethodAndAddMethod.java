package collectionFrameworkArrayList;

import java.util.ArrayList;

//isEmpty() and add()

public class IsEmptyMethodAndAddMethod {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		obj.add(100);
		obj.add('a');
		obj.add(true);
		System.out.println(obj);
		System.out.println(obj.isEmpty());
	}
}
