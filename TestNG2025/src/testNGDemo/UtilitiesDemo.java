package testNGDemo;

public class UtilitiesDemo  extends Utilities2{
	int a;
	public UtilitiesDemo(int a) {
		super(a);
		this.a=a;
	}


	public int increment()
	{
		a=a+1;
		return a;
	}
	
	
	public int decrement()
	{
		a=a-1;
		return a;
	}
}
