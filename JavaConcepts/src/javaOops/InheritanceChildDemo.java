package javaOops;

public class InheritanceChildDemo  extends InheritanceDemoParent{

	
	public void enginee()
	{
		System.out.println("new enginee from child");
	}
	
	
	public void colour()
	{
		System.out.println(colour +" from parent");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InheritanceChildDemo ic =new InheritanceChildDemo();
		ic.colour();
		ic.breaks();
	}

}
