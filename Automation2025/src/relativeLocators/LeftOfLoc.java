package relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class LeftOfLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/angularpractice/");
				
			WebElement checkname=	driver.findElement(By.className("form-check-label"));
			driver.findElement(with(By.tagName("input")).toLeftOf(checkname)).click();
	}

}
