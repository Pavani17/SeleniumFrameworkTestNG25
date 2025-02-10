package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Stream.of("pavani", "kakileti", "satya", "sri").filter(s -> s.endsWith("i"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(names.get(1));
	}

}
