package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] arrayStr = new String[6];
		System.out.println(arrayStr.length);
		arrayStr[3]="hi";
		for (String elt : arrayStr) {
			System.out.println(elt);
		}
		
		List<String> list = new ArrayList<>(10);
		List<Integer> ll = new LinkedList<>();
		System.out.println(list.size());
		list.add("a");
		System.out.println(list.size());
		list.add("a");
		System.out.println(list.size());
		System.out.println(list);
		list.set(2,"d");
		System.out.println(list);
		System.out.println(list.contains("b"));
		list.remove("c");
		System.out.println(list.equals(list));
		 String val = null;

			val = 
					list.get(1);
		
		ll.add(new Integer(8));
		ll.add(2);
		
	   //Integer oi = new Integer(2);
		//int i = oi.intValue();
		Integer oi = 2;
		int i = oi;
	}
}
