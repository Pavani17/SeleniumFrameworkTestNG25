package abstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.CartPage;
import pageObjects.OrderPageTest;

public class AbstractComponent {
	WebDriver driver;

	@FindBy(css = "[routerlink*='cart']")
	WebElement cartHeader;
	
	@FindBy(xpath="//button[@routerlink='/dashboard/myorders']")
	WebElement orderHistory;

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void waitforElementToAppear(By findProducts) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findProducts));
	}
	public void waitforWebbElementToAppear(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public void waitforElementToDisappear(WebElement spinele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(spinele));
	}
	
	public CartPage goToCartPage()
	{
		cartHeader.click();
		CartPage cPage= new CartPage(driver);
		return cPage;
	}
	
	public OrderPageTest goToOrderPage()
	{
		orderHistory.click();
		OrderPageTest orderpage=new OrderPageTest(driver);
		return orderpage;
		
	}

	

}
