package synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] neededvegArray = { "Carrot", "Cucumber", "Beetroot", "Potato" };

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		addToCart(driver, neededvegArray);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}

	public static void addToCart(WebDriver driver, String[] neededvegArray) {
		int j = 0;
		List<String> vegArrayList = Arrays.asList(neededvegArray);
		List<WebElement> vegetables = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < vegetables.size(); i++) {
			String vegProduct = vegetables.get(i).getText().split("-")[0].trim();

			if (vegArrayList.contains(vegProduct)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				if (j == neededvegArray.length) {
					break;
				}

			}
		}
	}

}
