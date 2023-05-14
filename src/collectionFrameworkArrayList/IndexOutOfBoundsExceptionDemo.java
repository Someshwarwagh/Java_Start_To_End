package collectionFrameworkArrayList;

import java.util.ArrayList;

//printing value using for loop

public class IndexOutOfBoundsExceptionDemo {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(3);
		obj.add("apple");
		obj.add("iceCream");
		obj.add("mango");
		System.out.println(obj.get(5)); //exception
	}
}
