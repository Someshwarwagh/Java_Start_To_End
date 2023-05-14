package collectionFrameworkArrayList;

import java.util.*;

public class MakingForeachLoopHomogenious {
	//Making Foreach Loop Homogenious
	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(100);
		obj.add(200);
		obj.add(10);
		
		for (Integer object : obj) {
			System.out.println(object);
		}
		
	}
}
