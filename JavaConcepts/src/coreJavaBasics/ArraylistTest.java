package coreJavaBasics;

import java.util.ArrayList;

public class ArraylistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		 names.add("Pavani");
		 names.add("Satyavathi");
		 names.add("Kakileti");
		 names.add("selenium");
		 names.remove(2);
		System.out.println( names.get(2));
		
		for(int i=0;i< names.size();i++)
		{
			System.out.println( names.get(i));
		}
		
		//enhanced for loop
		System.out.println("###");
		for (String s: names)
		{
			System.out.println(s);
		}
		
		//contains
		System.out.println(names.contains("java"));
	}


}
