package coreJava;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		d.getData();
		String name = d.getString();
		System.out.println(name);

		int number = d.getIntegers();
		System.out.println(number);
		
		Methodsdemo2 md2= new Methodsdemo2();
		md2.getuserData();
		getStaticdata();
		
	}

	public void getData() {
		System.out.println("I am from method");
	}
	
	public static void getStaticdata()
	{
		System.out.println("I am from static method");
	}

	public String getString() {
		return "Pavani";
	}

	public int getIntegers() {
		return 13;
	}

}
