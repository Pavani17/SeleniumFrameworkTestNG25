package streams;

import java.util.stream.Stream;

public class CountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long d = Stream.of("testing", "tester", "test", "selenium", "cucumber").filter(s -> 
		{
			s.startsWith("t");
			return true;
		}).count();
		System.out.println(d);
	}

}
