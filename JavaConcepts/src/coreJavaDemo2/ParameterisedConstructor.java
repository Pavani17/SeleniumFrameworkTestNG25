package coreJavaDemo2;

public class ParameterisedConstructor {

	public ParameterisedConstructor() {
		System.out.println("I am from default constructor with no parameters");

	}

	public ParameterisedConstructor(int a, int b) {
		System.out.println("am from parameterised constructor");
	}
	
	public ParameterisedConstructor(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterisedConstructor pc = new ParameterisedConstructor();
		ParameterisedConstructor pc1 = new ParameterisedConstructor(3, 4);
		ParameterisedConstructor pc3=new ParameterisedConstructor("hello pavani");

	}

}
