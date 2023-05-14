package collectionFrameworkArrayList;

import java.util.ArrayList;

//obj1.addAll(obj)

public class AddAllMethod {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("tiger");
		obj.add("mariegold");
		System.out.println(obj);
		System.out.println(obj.size());
		
		ArrayList obj1 = new ArrayList();
		obj1.add("parleG");
		obj1.add("goodDay");
		System.out.println(obj1);
		System.out.println(obj1.size());
		
		
		obj1.addAll(obj); //adding total object as a one object  1.add(object_ref_var)
		System.out.println(obj1);
		System.out.println(obj1.size());
		
	}
}
