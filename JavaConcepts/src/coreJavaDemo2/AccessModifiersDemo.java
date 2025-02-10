package coreJavaDemo2;

public class AccessModifiersDemo {
	
	int i=5;
	public int j=10;
	private int k=6;
	protected int m=67;
	
	void getDefault()
	{
		System.out.println("default modifier");
	}
	
	public void getdefault()
	{
		System.out.println("method with public modifier");
	}
	
	public void getPublicmodifier()
	{
		System.out.println("public modifier)");
	}

	
	private void getPrivatemethod()
	{
		System.out.println("pavani from private method");
	}
	
	protected void getProtected()
	{
		System.out.println("protected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
