package coreJava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pavani");
		al.add("Kakileti");
		al.add("Automation testing");
		al.add("Functional Tester");
		al.add("Selenium");
		System.out.println(al.get(2));
	al.remove(2);
	System.out.println(al.get(2));
	
	for(int i =0;i<al.size();i++)
	{
	System.out.println(al.get(i));
	}
	
	//enhanced for loop
	for(String name: al)
	{
		System.out.println(name);
	}
	
	
	

	}

}
