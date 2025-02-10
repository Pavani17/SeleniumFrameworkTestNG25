package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("Pavani");
		hs.add("Satya");
		hs.add("Satya");
		hs.add("java");
		hs.add("selenium");
		System.out.println(hs);
		hs.remove("Pavani");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String>i=hs.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		}
	
		
	}


