package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSortingUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> OriginlavegList = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> originalListNames = OriginlavegList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedlist = originalListNames.stream().sorted().collect(Collectors.toList());

		Assert.assertEquals(originalListNames, sortedlist);
		List<String> price;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

			price = rows.stream().filter(s -> s.getText().contains("Chocolate")).map(s -> getPriceveg(s))
					.collect(Collectors.toList());
			price.forEach(s -> System.out.println(s));

			if (price.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}

		} while (price.size() < 1);

		;
		driver.quit();
	}

	public static String getPriceveg(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;

	}
}
