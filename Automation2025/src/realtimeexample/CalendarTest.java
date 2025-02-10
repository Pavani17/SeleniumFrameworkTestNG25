package realtimeexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String year = "2028";
		String month = "6";
		String date = "17";
		
		String[] expectedDate = {month,date,year};

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(month) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText());

		List<WebElement> actuallist = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for (int i = 0; i < actuallist.size(); i++) {
			System.out.println(actuallist.get(i).getDomAttribute("value"));
			Assert.assertEquals(actuallist.get(i).getDomAttribute("value"),expectedDate[i]);
			
		}
		driver.quit();
	}

}
