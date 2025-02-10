package javaOops;

public class InterfaceClass implements InterfaceDemo, Interface2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo id = new InterfaceClass();
		id.greenGo();
		id.redStop();
		id.flashYellow();

		InterfaceClass ic = new InterfaceClass();
		ic.getClassMethod();

		Interface2Demo i2 = new InterfaceClass();
		i2.getInterfacemethod();

	}

	public void getClassMethod() {
		System.out.println("This is from class method");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow");
	}

	@Override
	public void getInterfacemethod() {
		// TODO Auto-generated method stub
		System.out.println("I am from Interface2 as class can implements multiple interfaces");
	}

}
