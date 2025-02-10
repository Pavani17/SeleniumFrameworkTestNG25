package streams;

import java.util.stream.Stream;

public class SortedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("pavani", "satya", "kakileti", "Talli","sadmi","sri")
		.filter(s->s.startsWith("s")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
	}

}
