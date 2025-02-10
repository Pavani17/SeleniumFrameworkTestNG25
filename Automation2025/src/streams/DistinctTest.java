package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 17, 30, 10, 2, 30, 10, 2, 67, 73);
		numbers.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		List<Integer> values = Arrays.asList(1, 17, 30, 10, 2, 30, 10, 2, 67, 73);
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

}
