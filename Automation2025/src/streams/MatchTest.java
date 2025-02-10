package streams;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

public class MatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> testingnames = Arrays.asList("Testing", "Selenium", "Automation");
		
	boolean flag=	testingnames.stream().anyMatch(s->s.equalsIgnoreCase("Manual"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

}
