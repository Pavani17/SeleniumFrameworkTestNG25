package streams;

import java.util.ArrayList;

public class RegularCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("kakileti");
		names.add("pavani");
		names.add("satya");
		names.add("satyavathi");
		names.add("sri");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {

			String actual = names.get(i);

			if (actual.startsWith("s")) {
				count++;

			}

		}

		System.out.println(count);
	
	}

}
