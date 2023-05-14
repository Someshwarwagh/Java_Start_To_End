package collectionFrameworkArrayList;

import java.util.ArrayList;

//printing value using for loop

public class PrintingArrayListWithForLoop {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(3);
		obj.add("apple");
		obj.add("iceCream");
		obj.add("mango");

		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i));
		}
	}
}
