package coreJava;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Kakileti Pavani Satyavathi";
		String s1= "Kakileti Pavani Satyavathi";
		String s2= "Hello";
		
		String s3= new String("Kakileti Pavani Satyavathi");
		String s4 =new String ("Kakileti Pavani Satyavathi");
		
		String[] spilttedstring=s.split(" ");
		System.out.println(spilttedstring[0]);
		System.out.println(spilttedstring[1]);
		System.out.println(spilttedstring[2]);
		
		String[] spilttedstring1=s.split("Pavani");
		
		System.out.println(spilttedstring1[0].trim());
		System.out.println(spilttedstring1[1].trim());
		
		spilttedstring1[0].trim();
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		String name = "Pavani";
		
		for (int i =name.length()-1; i >=0;i-- )
		{
			System.out.println(name.charAt(i));
		}
		
		
	}

}
