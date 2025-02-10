package assigmentsTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7Tablerow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int rows = driver.findElements(By.cssSelector(".table-display  tr")).size();

		System.out.println(rows);
		/*
		 * int columns = driver.findElements(By.xpath(
		 * "//div[@class='left-align']/fieldset/table/tbody/tr[1]/th)")).size();
		 * System.out.println(columns); List<WebElement> secondRow = driver
		 * .findElements(By.xpath(
		 * "//div[@class='left-align']/fieldset/table/tbody/tr[3]/td"));
		 */
		 int columns = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[1]/th")).size();
	       System.out.println(columns);
	        List<WebElement> secondRow=driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[3]/td"));
	for(int i=0;i<secondRow.size();i++)
	{
		String value=secondRow.get(i).getText();
		System.out.println(value);
	}
	}

}
