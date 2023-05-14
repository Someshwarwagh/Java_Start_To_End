package collectionFrameworkArrayList;

import java.util.*;

//sort() and reverse()
public class IteratorInterface {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(2);
		obj.add(4);
		obj.add(1);
		obj.add(3);
		System.out.println(obj);

		Iterator var=obj.iterator();
		
		while (var.hasNext()) {
			System.out.println(var.next());
		}
		
	}
}
