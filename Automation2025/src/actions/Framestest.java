package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framestest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement dragSource = driver.findElement(By.id("draggable"));
		WebElement dropTarget = driver.findElement(By.id("droppable"));

		Actions a = new Actions(driver);
		a.dragAndDrop(dragSource, dropTarget).build().perform();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().defaultContent();
		driver.quit();

	}

}
