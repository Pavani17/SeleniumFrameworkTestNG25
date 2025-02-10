package coreJavaDemo2;

public class ExceptionsDemo {



	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=7;
		int c=0;
		
		try 
		{
			//int k=b/c;
			
			int[] a= {3,5,6,10,12};
			System.out.println(a[7]);
			
		}
		catch(IndexOutOfBoundsException i)
		{
			System.out.println("indexoutof exception");
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("arthemetic exception");
		}
		catch(Exception e){
			System.out.println("catch exception");
		}
		
		finally
		{
			System.out.println("done");
		}
	
		
		
	}

}