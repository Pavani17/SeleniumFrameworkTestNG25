package synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IImplicitWaitexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] neededvegArray = { "Carrot", "Cucumber", "Beetroot", "Potato" };

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		addToCart(driver, neededvegArray);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
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
