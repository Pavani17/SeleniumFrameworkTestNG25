package javaOops;

public class MultiDemensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];
		
		a[0][0] =3;
		a[0][1]=5;
		a[0][2]=6;
		a[1][0]=8;
		a[1][1]=4;
		a[1][2]=10;
		
		System.out.println(a[1][0]);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		int b[][]= {{1,2,5},{5,90,67},{6,89,45}};
		System.out.println(b[2][1]);

	}

}
