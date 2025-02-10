package realtimeexample;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverscopeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		WebElement coldriver = footerdriver.findElement(By.xpath("//table/tbody//tr/td/ul[1]"));
		System.out.println(coldriver.findElements(By.tagName("a")).size());
		List<WebElement> links = coldriver.findElements(By.tagName("a"));
		String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		for (int i = 1; i < links.size(); i++) {
			coldriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

			Thread.sleep(3000);
		}
			Set<String> openwindows = driver.getWindowHandles();

			Iterator<String> it = openwindows.iterator();

			while (it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
		
		driver.quit();
	}

}
