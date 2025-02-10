package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("kakileti");
		names.add("pavani");
		names.add("satya");
		names.add("sri");

		List<String> testingnames = Arrays.asList("Testing", "Selenium", "Automation");

		Stream<String> newStream = Stream.concat(names.stream(), testingnames.stream());
		newStream.sorted().forEach(s->System.out.println(s));

	}

}
