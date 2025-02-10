package testNGDemo;

import org.testng.annotations.Test;

public class ChildclassDemo extends ParentclassDemo{
	
@Test
public void runchildTest()
{
dothisParent();
int a=3;
UtilitiesDemo ud= new UtilitiesDemo(3);
 System.out.println(ud.increment());
 System.out.println(ud.decrement());
 System.out.println(ud.multiplyTwo());
 System.out.println(ud.multiplyThree());
}
}
