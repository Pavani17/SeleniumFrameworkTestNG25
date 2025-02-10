package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pavani");
		al.add("Java");
		al.add("selenium");
		al.add("testing");
		System.out.println(al);

		al.add(0, "kakileti");

		System.out.println(al);
		al.remove(2);
		al.remove("Pavani");

		System.out.println(al);

		System.out.println(al.get(1));
		System.out.println(al.contains("kakileti"));
		System.out.println(al.indexOf("kakileti"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}

}
