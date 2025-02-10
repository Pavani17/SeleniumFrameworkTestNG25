package assigmentsTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assigment3ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();
		WebElement ddl = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s = new Select(ddl);
		s.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='nav-item active']")));
		
		List<WebElement>products=driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0;i<products.size();i++)
		{
			products.get(i).click();
			int j=0;
			if(j==4)
			{
				j++;
			}
		}
		
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		driver.quit();
	}

}
