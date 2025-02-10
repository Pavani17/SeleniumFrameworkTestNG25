package miscellaneoustopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MultiBrokenlinksTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));

		for (WebElement link : links) {
			String urlcheck = link.getDomAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(urlcheck).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			System.out.println(resCode);
			if (resCode > 400) {
				System.out.println(link.getText());
				Assert.assertTrue(false);
			} 
		}

	}

}
