package assigmentsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.xpath("//label[@for='benz']")).getText());
		String checkbox = driver.findElement(By.xpath("//label[@for='benz']")).getText();

		WebElement ddl = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(ddl);
		s.selectByVisibleText(checkbox);
		System.out.println(s.getFirstSelectedOption().getText());
		driver.findElement(By.id("name")).sendKeys(checkbox);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains(checkbox)) {
			System.out.println("success");
		} else {
			System.out.println("fail");
		}

	}

}
