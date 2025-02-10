package javaOops;

public class FunctionOverloadingDemo {


	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void getData(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloadingDemo demo= new FunctionOverloadingDemo();
		demo.getData(467);
		demo.getData("Pavani");
		demo.getData(3, 5);
		
	}
	
	

}
