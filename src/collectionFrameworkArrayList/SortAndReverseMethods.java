package collectionFrameworkArrayList;

import java.util.*;

//sort() and reverse()
public class SortAndReverseMethods {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(2);
		obj.add(4);
		obj.add(1);
		obj.add(3);
		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println(obj);
		Collections.sort(obj);
		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println(obj);
	}
}
