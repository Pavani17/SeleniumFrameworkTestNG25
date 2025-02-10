package coreJavaBasics;

public class MethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsTest m = new MethodsTest();
		m.getData();
		String name=m.getStringData();
		System.out.println(name);
		MethodsTest2 m2= new MethodsTest2 ();
		m2.getUserData();
	}

	public void getData() {
		System.out.println("hello QA");
	}
	
	public String getStringData()
	{
		return "Pavani";
	}

}
