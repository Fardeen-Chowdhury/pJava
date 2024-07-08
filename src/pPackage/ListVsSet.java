package pPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListVsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Set<Integer> set = new HashSet<Integer>();
		 set.add(10);
		 set.add(20);
		 set.add(30);
		 set.add(40);
		 set.add(50);
		 
		 List<Integer> list = new ArrayList<Integer>();
		 
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(40);
		 list.add(50);
		 
		 System.out.println(list.get(0));
		 
		 Iterator listValue = list.iterator();
		 
		 System.out.println(listValue.next());
		
	}

}
