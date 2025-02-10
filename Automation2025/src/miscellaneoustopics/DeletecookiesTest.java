package miscellaneoustopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletecookiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("aaaa");
		
		driver.manage().addCookie(null);
		driver.manage().deleteCookieNamed("sessionkey");
		driver.get("https://www.w3schools.com/");
	}

}
