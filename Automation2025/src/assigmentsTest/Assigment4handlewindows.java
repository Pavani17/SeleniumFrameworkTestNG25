package assigmentsTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment4handlewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.quit();
		
	}
	

}
