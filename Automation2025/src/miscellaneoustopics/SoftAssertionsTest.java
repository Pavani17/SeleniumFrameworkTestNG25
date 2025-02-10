package miscellaneoustopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		SoftAssert a = new SoftAssert();
		for (WebElement link : links) {
			String urlcheck = link.getDomAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(urlcheck).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			System.out.println(resCode);
			a.assertTrue(resCode < 400, "The link text with " + link.getText() + "is broken");

		}
		a.assertAll();
	}
}
