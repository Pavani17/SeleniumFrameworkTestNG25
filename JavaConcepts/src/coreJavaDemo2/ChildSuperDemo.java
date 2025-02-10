package coreJavaDemo2;

public class ChildSuperDemo  extends ParentSuperDemo{

	String name ="Kakileti";
	
	public ChildSuperDemo()
	
	{
		super();
		System.out.println("from child class constructor");
	}
	
	public void getStringData()
	{
	System.out.println(name);
	System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("from child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildSuperDemo cd=new ChildSuperDemo();
		cd.getStringData();
		cd.getData();
		
	}

}
