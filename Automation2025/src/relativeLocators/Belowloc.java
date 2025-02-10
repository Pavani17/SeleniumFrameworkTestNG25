package relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Belowloc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
	WebElement lblDOB=	driver.findElement(By.xpath("//label[@for='dateofBirth']"));
	
	driver.findElement(with(By.tagName("input")).below(lblDOB)).click();
	//driver.quit();
	}

}
