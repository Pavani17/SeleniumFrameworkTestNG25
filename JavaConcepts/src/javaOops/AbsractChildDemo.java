package javaOops;

public class AbsractChildDemo  extends AbstractParentClassDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsractChildDemo  cd=new AbsractChildDemo() ;
		cd.bodyColour();
		cd.engine();
	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Blue colour implemented from child class");
	}

}
