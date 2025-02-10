package javaOops;

public class InterviewMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]a= {{10,6,8},{6,45,34},{2,99,34}};
		 int min =a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]< min)
				{
					min =a[i][j];
				
				}
			}
			
			
		}
			
		System.out.println(min);	
		
	}

}
