package streams;

import java.util.stream.Stream;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("pavani", "satya", "kakileti", "Talli").filter(s -> s.endsWith("i")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}

}
