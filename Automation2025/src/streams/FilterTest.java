package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class FilterTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("kakileti");
		names.add("pavani");
		names.add("satya");
		names.add("satyavathi");

		Long c = names.stream().filter(s -> s.startsWith("s")).count();
		System.out.println(c);

	
	}

}
