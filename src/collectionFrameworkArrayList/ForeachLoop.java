package collectionFrameworkArrayList;

import java.util.*;

public class ForeachLoop {
	//Printing value with the help of foreach loop
	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(100);
		obj.add('a');
		obj.add(true);
		
		for (Object object : obj) {
			System.out.println(object);
		}
		
	}
}
