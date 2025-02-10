package streams;

import java.util.stream.Stream;

public class LimitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("testing", "tester", "test", "selenium", "cucumber").filter(s -> s.length()>4).limit(2).forEach(s->System.out.println(s));
	
	}

}
