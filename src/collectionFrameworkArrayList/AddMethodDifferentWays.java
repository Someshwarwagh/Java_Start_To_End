package collectionFrameworkArrayList;

import java.util.ArrayList;

//1.add(object_ref_var)
//2.add(indexValue,value)
//3.add(value)

public class AddMethodDifferentWays {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("tiger");
		obj.add("mariegold");
		obj.add("borbon"); //3.add(value)
		System.out.println(obj);
		System.out.println(obj.size());
		
		ArrayList obj1 = new ArrayList();
		obj1.add("parleG");
		obj1.add("goodDay");
		obj1.add(2,100); //2.add(indexValue,value)
		System.out.println(obj1);
		System.out.println(obj1.size());
		
		obj1.add(obj); //adding total object as a one object  1.add(object_ref_var)
		System.out.println(obj1);
		System.out.println(obj1.size());
		
	}
}
