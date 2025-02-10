package ecommerce;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiProducts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int j=0;
		String[] neededvegArray= {"Carrot","Cucumber","Beetroot","Potato"};
		
		List vegArrayList=Arrays.asList(neededvegArray);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);

		List<WebElement> vegetables = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<vegetables.size();i++)
		{
			String vegProduct=vegetables.get(i).getText().split("-")[0].trim();
			
		
			if(vegArrayList.contains(vegProduct))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				if(j==neededvegArray.length)
				{
					break;
				}
				
				/*
				 * if(j==neededvegArray.length) {
				 * 
				 * }
				 */
			}
		}
	}

}
