package coreJava;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//syntax 1
		int []arr = new int[5];
		arr[0] =17;
		arr[1]=1994;
		arr[2] =06;
		arr[3]=2016;
		arr[4]=2025;
		System.out.println(arr[4]);
		
		//syntax 2
		
		int[] arr2 = {17,06,1994,2007,2010};
		
		System.out.println(arr2[2]);
		
		//convert array to array list 
	List<int[]>	arraylistconvereted= Arrays.asList(arr2);
	
	System.out.println(arraylistconvereted.contains(7));
	}

}
