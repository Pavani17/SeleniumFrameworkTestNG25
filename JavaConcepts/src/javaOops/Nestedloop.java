package javaOops;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			System.out.println(i+"outer loop");
			
			for(int j=1;j<=4;j++)
			{
				System.out.println(j);
			}
		}
		
	
	}

}
