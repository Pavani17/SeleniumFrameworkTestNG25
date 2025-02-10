package miscellaneoustopics;

import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockpopupwindowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
		     Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver(options);
	}

}
