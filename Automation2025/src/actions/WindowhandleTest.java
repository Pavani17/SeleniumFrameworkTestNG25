package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
				driver.findElement(By.className("blinkingText")).click();
				Set<String> windows=driver.getWindowHandles();
				Iterator<String> it=windows.iterator();
				String parentId=it.next();
				String childId=it.next();
				driver.switchTo().window(childId);
				System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);
				String mailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
				driver.switchTo().window(parentId);
				driver.findElement(By.id("username")).sendKeys(mailId);
				//driver.quit();
	}
	

}
