package miscellaneoustopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlinksTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		String urlcheck = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getDomAttribute("href");
		System.out.println(urlcheck);

		HttpURLConnection conn = (HttpURLConnection) new URL(urlcheck).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int resCode = conn.getResponseCode();
		if (resCode > 400) {
			System.out.println("url broken");
		} else {
			System.out.println("url working");
		}

		driver.quit();
	}

}
