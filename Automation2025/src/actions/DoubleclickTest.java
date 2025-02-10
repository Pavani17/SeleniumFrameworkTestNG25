package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.w3schools.com/");
		WebElement search = driver.findElement(By.id("tnb-google-search-input"));
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("tnb-google-search-input"))).click().keyDown(Keys.DOWN)
				.sendKeys("html").doubleClick().build().perform();
	}

}
