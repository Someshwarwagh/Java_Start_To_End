package collectionFrameworkArrayList;

import java.util.ArrayList;

//contains() , size()  and get()

//Note : get() not work for integer if we pass integer value it consider index value bydefault but we can use valueOf(0 to solve this problem

public class ContainsSizeAndGetMethod {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(3);
		obj.add("apple");
		obj.add("iceCream");
		obj.add("mango");
		System.out.println(obj.contains("kiwi"));
		System.out.println(obj.size());
		System.out.println(obj.get(2));
	}
}
