package coreJavaBasics;

import java.util.Arrays;
import java.util.List;

public class ConvertArraytoArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] namearr = new String[3];
		namearr[0] = "Kakileti";
		namearr[1] = "Pavani";
		namearr[2] = "Satya";

		List<String> namesArrayaList = Arrays.asList(namearr);
		System.out.println(namesArrayaList.get(2));
		System.out.println(namesArrayaList .contains("selenium"));
	}

}
