package coreJavaBasics;

public class SplitTrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Kakileti Pavani Satyavathi";
		String[] spilttedString = s.split(" ");
		System.out.println(spilttedString[0]);
		System.out.println(spilttedString[1]);
		System.out.println(spilttedString[2]);
		
		String[] spilttedString1 = s.split("Pavani");
		System.out.println(spilttedString1[0]);
		System.out.println(spilttedString1[1].trim());
		
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//print reverse order
		
		for(int j=s.length()-1;j>=0;j--)
		{
			System.out.println(s.charAt(j));
		}
	
	}

}
